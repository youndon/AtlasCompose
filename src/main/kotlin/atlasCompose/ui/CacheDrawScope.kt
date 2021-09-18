package atlasCompose.ui

import androidx.compose.ui.draw.CacheDrawScope

private class CacheDrawScope {
    val CacheDrawScope.ss: Any
        get() = this.apply {
            this.layoutDirection
            this.size
            this.onDrawBehind { }
            this.onDrawWithContent { }
        }
}