package compose.animation

import androidx.compose.animation.core.FloatSpringSpec

private class FloatSpringSpec {
    init {
        FloatSpringSpec().run {
            this.dampingRatio
            this.stiffness
        }
    }
}