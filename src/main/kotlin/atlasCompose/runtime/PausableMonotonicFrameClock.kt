package atlasCompose.runtime

import androidx.compose.runtime.MonotonicFrameClock
import androidx.compose.runtime.PausableMonotonicFrameClock

private interface PausableMonotonicFrameClock {
    val PausableMonotonicFrameClock.ss: Any
        get() = this.apply {
            this.isPaused
            this.pause()
            this.resume()
        }
}