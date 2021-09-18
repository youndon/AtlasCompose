package compose.animation

import androidx.compose.animation.core.AnimationVector
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec

private interface VectorizedDurationBasedAnimationSpec {
        val <T:AnimationVector> VectorizedDurationBasedAnimationSpec<T>.ss:Any
        get() = this.apply {
            this.delayMillis
            this.durationMillis
        }
}