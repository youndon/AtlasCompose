package compose.animation

import androidx.compose.animation.core.AnimationVector
import androidx.compose.animation.core.VectorizedAnimationSpec

private interface VectorizedAnimationSpec {
       val <T:AnimationVector> VectorizedAnimationSpec<T>.ss:Any
       get() = this.apply {
           this.isInfinite
//           this.getDurationNanos()
//           this.getEndVelocity()
//           this.getValueFromNanos()
//           this.getVelocityFromNanos()
//           this.createAnimation()
       }
}