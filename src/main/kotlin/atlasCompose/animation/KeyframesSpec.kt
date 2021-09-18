package compose.animation

import androidx.compose.animation.core.KeyframesSpec

private class KeyframesSpec {
    private val <T> KeyframesSpec<T>.ss:Any
    get() = this.config
}