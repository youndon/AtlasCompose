package compose.animation

import androidx.compose.animation.core.AnimationState
import androidx.compose.animation.core.AnimationVector

private class AnimationState {
    private val <T,V:AnimationVector> AnimationState<T,V>.ss:Any
    get() = this.apply {
        this.finishedTimeNanos
        this.isRunning
        this.lastFrameTimeNanos
        this.typeConverter
        this.velocity
        this.velocityVector
//        this.animateDecay()
//        this.animateTo()
    }
}