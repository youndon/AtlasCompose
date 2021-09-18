package atlasCompose.ui

import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.platform.WindowInfo

private interface WindowInfo {
    val WindowInfo.ss: Any
        get() = this.isWindowFocused
}