package compose.animation

import androidx.compose.animation.core.AnimationVector
import androidx.compose.animation.core.TwoWayConverter

private interface TwoWayConverter {
        private val <T,V:AnimationVector>TwoWayConverter<T,V>.ss:Any
        get() = this.apply {
            this.convertFromVector
            this.convertFromVector
//            this.createZeroVectorFrom()
        }
}