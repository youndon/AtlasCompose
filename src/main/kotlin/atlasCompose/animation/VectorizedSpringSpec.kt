package compose.animation

import androidx.compose.animation.core.AnimationVector
import androidx.compose.animation.core.VectorizedSpringSpec

private class VectorizedSpringSpec {
       private val <T:AnimationVector>VectorizedSpringSpec<T>.ss:Any
        get() = this.apply {
            this.dampingRatio
            this.stiffness
        }
}