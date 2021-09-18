package compose.animation

import androidx.compose.animation.core.AnimationVector
import androidx.compose.animation.core.VectorizedDecayAnimationSpec

private interface VectorizedDecayAnimationSpec {
    val <T:AnimationVector> VectorizedDecayAnimationSpec<T>.ss:Any
    get() = this.apply {
        this.absVelocityThreshold
//        this.getDurationNanos()
//        this.getTargetValue()
//        this.getValueFromNanos()
//        this.getVelocityFromNanos()
    }
}