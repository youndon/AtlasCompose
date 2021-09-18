package compose.animation

import androidx.compose.animation.core.SpringSpec

private class SpringSpec {
    private val <T> SpringSpec<T>.ss:Any
    get() = this.apply {
        this.dampingRatio
        this.stiffness
        this.visibilityThreshold
    }
}