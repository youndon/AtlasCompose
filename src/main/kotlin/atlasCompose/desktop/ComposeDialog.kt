package compose.desktop

import androidx.compose.ui.awt.ComposeDialog


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