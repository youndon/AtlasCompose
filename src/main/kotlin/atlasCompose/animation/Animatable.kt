package compose.animation

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector

private class Animatable {
   private val <T,V:AnimationVector> Animatable<T,V>.ss: Any
        get() = this.apply {
            this.isRunning
            this.lowerBound
            this.targetValue
            this.typeConverter
            this.upperBound
            this.value
            this.velocity
            this.velocityVector
//            this.animateDecay()
//            this.animateTo()
            this.asState()
//            this.snapTo()
//            this.stop()
            this.updateBounds()
        }
}