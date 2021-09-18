package compose.animation

import androidx.compose.animation.core.DecayAnimationSpec

private interface DecayAnimationSpec {
    val <T> DecayAnimationSpec<T>.ss: Any
    get() = this.apply {
//        this.vectorize()
    }
}