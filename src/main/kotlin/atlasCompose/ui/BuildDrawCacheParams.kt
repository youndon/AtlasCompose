package atlasCompose.ui

import androidx.compose.ui.draw.BuildDrawCacheParams

private interface BuildDrawCacheParams {
    val BuildDrawCacheParams.ss: Any
        get() = this.apply {
            this.density
            this.layoutDirection
            this.size
        }
}