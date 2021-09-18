package compose.desktop

import androidx.compose.desktop.ComposeWindow

private class ComposeWindow {
    init {
        ComposeWindow().apply {
//            this.isFullscreen
//            this.isMaximized
            this.isMinimized
            this.renderApi
            this.windowHandle
            this.onRenderApiChanged { }
            this.setContent { }
        }
    }
}