package compose.desktop

import androidx.compose.desktop.WindowEvents

private class WindowEvents {
    init {
        WindowEvents().apply {
            this.onClose
            this.onFocusGet
            this.onFocusLost
            this.onMaximize
            this.onMinimize
            this.onOpen
            this.onRelocate
            this.onResize
            this.onRestore
        }
    }
}