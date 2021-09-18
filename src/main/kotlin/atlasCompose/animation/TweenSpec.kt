package compose.animation

import androidx.compose.animation.core.TweenSpec

private class TweenSpec {
    private val <T> TweenSpec<T>.ss: Any
        get() = this.apply {
            this.delay
            this.durationMillis
            this.easing
        }
}