package compose.animation

import androidx.compose.animation.core.Animation
import androidx.compose.animation.core.AnimationVector
import kotlin.apply

private interface Animation {
    val <T,V:AnimationVector> Animation<T,V>.ss:Any
    get() = this.apply {
        this.durationNanos
        this.isInfinite
        this.targetValue
        this.typeConverter
//        this.getValueFromNanos()
//        this.getVelocityVectorFromNanos()
//        this.isFinishedFromNanos()
    }
}