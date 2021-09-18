package compose.animation

import androidx.compose.animation.core.FloatDecayAnimationSpec

private interface FloatDecayAnimationSpec {
        val ss : FloatDecayAnimationSpec
        get() = ss.apply {
            this.absVelocityThreshold
//            this.getDurationNanos()
//            this.getTargetValue()
//            this.getValueFromNanos()
//            this.getVelocityFromNanos()
        }
}