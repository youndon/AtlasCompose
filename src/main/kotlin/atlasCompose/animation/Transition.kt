package compose.animation

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.*
import androidx.compose.animation.core.Transition

private class Transition {
   @OptIn(InternalAnimationApi::class)
   private val <S> Transition<S>.ss:Any
   get() = this.apply {
       this.animations
       this.currentState
       this.isRunning
       this.label
       this.playTimeNanos
       this.segment
       this.totalDurationNanos
//       this.seek()
//       this.animateDp {  }
//       this.animateInt {  }
//       this.animateIntOffset {  }
//       this.animateIntSize {  }
//       this.animateFloat { }
//       this.animateOffset { }
//       this.animateRect {  }
//       this.animateValue()
//       this.animateColor {  }
   }
}