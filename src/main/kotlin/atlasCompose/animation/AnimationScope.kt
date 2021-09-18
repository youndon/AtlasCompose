package compose.animation

import androidx.compose.animation.core.AnimationScope
import androidx.compose.animation.core.AnimationVector

private class AnimationScope {
    private val <T,V:AnimationVector> AnimationScope<T,V>.ss:Any
    get() = this.apply {
        this.finishedTimeNanos
        this.isRunning
        this.lastFrameTimeNanos
        this.startTimeNanos
        this.targetValue
        this.typeConverter
        this.value
        this.velocity
        this.velocityVector
        this.cancelAnimation()
        this.toAnimationState()
    }
}