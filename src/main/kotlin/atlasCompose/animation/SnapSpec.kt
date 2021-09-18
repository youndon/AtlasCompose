package compose.animation

import androidx.compose.animation.core.SnapSpec

private class SnapSpec {
    private val <T> SnapSpec<T>.ss:Any
    get() = this.delay
}