package compose.desktop

import androidx.compose.desktop.ComposeDialog

private class ComposeDialog {
    init {
        ComposeDialog().apply {
            this.renderApi
            this.windowHandle
            this.onRenderApiChanged {  }
            this.setContent {  }
        }
    }
}