package compose.animation

import androidx.compose.animation.core.AnimationSpec

private interface AnimationSpec {
    private val <T> AnimationSpec<T>.ss: Any
        get() = this.apply {
//            this.vectorize()
        }
}