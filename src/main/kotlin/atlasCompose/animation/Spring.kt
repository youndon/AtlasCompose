package compose.animation

import androidx.compose.animation.core.Spring

private class Spring {
    init {
        Spring.apply {
            this.DampingRatioHighBouncy
            this.DampingRatioLowBouncy
            this.DampingRatioMediumBouncy
            this.DampingRatioNoBouncy
            this.DefaultDisplacementThreshold
            this.StiffnessHigh
            this.StiffnessLow
            this.StiffnessMedium
            this.StiffnessVeryLow
        }
    }
}