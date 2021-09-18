package compose.animation

import androidx.compose.animation.core.MutableTransitionState

private class MutableTransitionState {
     private val <S> MutableTransitionState<S>.ss:Any
     get() = this.apply {
         this.currentState
         this.isIdle
         this.targetState
     }
}