package compose.animation

import androidx.compose.animation.core.InfiniteRepeatableSpec

private class InfiniteRepeatableSpec {
    val <T> InfiniteRepeatableSpec<T>.ss:Any
    get() = this.apply {
        this.animation
        this.repeatMode
    }
}