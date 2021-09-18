package compose.animation

import androidx.compose.animation.core.AnimationResult
import androidx.compose.animation.core.AnimationVector

private class AnimationResult {
    private val <T, V : AnimationVector> AnimationResult<T, V>.ss: Any
        get() = this.apply {
            this.endReason
            this.endState
        }
}