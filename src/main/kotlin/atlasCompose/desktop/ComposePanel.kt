package compose.desktop

import androidx.compose.desktop.ComposePanel

private class ComposePanel {
    init {
        ComposePanel().apply {
            this.renderApi
            this.setContent {  }
        }
    }
}