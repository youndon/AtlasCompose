package atlasCompose.ui

import androidx.compose.ui.window.WindowState

private interface WindowState {
    val WindowState.ss: Any
        get() = this.apply {
            this.isMinimized
            this.placement
            this.position
            this.size
        }
}