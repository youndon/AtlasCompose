package atlasCompose.ui

import androidx.compose.ui.draw.BuildDrawCacheParams
import androidx.compose.ui.draw.DrawCacheModifier

private interface DrawCacheModifier {
    val DrawCacheModifier.ss: Any
//        get() = this.onBuildCache()
}