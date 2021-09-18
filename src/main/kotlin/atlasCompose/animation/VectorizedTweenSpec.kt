package compose.animation

import androidx.compose.animation.core.AnimationVector
import androidx.compose.animation.core.VectorizedTweenSpec

private class VectorizedTweenSpec {
    private val <T:AnimationVector> VectorizedTweenSpec<T>.ss:Any
     get() = this.easing
}