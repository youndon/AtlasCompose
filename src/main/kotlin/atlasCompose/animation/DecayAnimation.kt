package compose.animation

import androidx.compose.animation.core.AnimationVector
import androidx.compose.animation.core.DecayAnimation

private class DecayAnimation {
   private val <T,V:AnimationVector> DecayAnimation<T,V>.ss:Any
   get() = this.apply {
       this.initialValue
       this.initialVelocityVector
   }
}