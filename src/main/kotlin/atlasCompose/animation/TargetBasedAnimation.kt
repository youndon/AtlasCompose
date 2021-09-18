package compose.animation

import androidx.compose.animation.core.AnimationVector
import androidx.compose.animation.core.TargetBasedAnimation

private class TargetBasedAnimation {
     private val <T,V:AnimationVector> TargetBasedAnimation<T,V>.ss: T
      get() = this.initialValue

}