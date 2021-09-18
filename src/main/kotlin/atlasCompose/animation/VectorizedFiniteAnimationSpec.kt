package compose.animation

import androidx.compose.animation.core.AnimationVector
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec

@Deprecated("Don't have any public members!!")
private interface VectorizedFiniteAnimationSpec {
    val <T:AnimationVector> VectorizedFiniteAnimationSpec<T>.ss:Any
}