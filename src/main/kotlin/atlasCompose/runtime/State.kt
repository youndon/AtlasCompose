package atlasCompose.runtime

import androidx.compose.runtime.MonotonicFrameClock
import androidx.compose.runtime.Recomposer
import androidx.compose.runtime.State
import kotlinx.coroutines.cancel

private enum class State {

    /**
     * [cancel] was called on the [Recomposer] and all cleanup work has completed.
     * The [Recomposer] is no longer available for use.
     */
    ShutDown,

    /**
     * [cancel] was called on the [Recomposer] and it is no longer available for use.
     * Cleanup work has not yet been fully completed and composition effect coroutines may
     * still be running.
     */
    ShuttingDown,

    /**
     * The [Recomposer] is not tracking invalidations for known composers and it will not
     * recompose them in response to changes. Call [runRecomposeAndApplyChanges] to await and
     * perform work. This is the initial state of a newly constructed [Recomposer].
     */
    Inactive,

    /**
     * The [Recomposer] is [Inactive] but at least one effect associated with a managed
     * composition is awaiting a frame. This frame will not be produced until the [Recomposer]
     * is [running][runRecomposeAndApplyChanges].
     */
    InactivePendingWork,

    /**
     * The [Recomposer] is tracking composition and snapshot invalidations but there is
     * currently no work to do.
     */
    Idle,

    /**
     * The [Recomposer] has been notified of pending work it must perform and is either
     * actively performing it or awaiting the appropriate opportunity to perform it.
     * This work may include invalidated composers that must be recomposed, snapshot state
     * changes that must be presented to known composers to check for invalidated
     * compositions, or coroutines awaiting a frame using the Recomposer's
     * [MonotonicFrameClock].
     */
    PendingWork

}