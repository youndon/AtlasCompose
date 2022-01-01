package compose.desktop

import androidx.compose.ui.awt.ComposePanel

private class ComposePanel {
    init {
        ComposePanel().apply {
            this.renderApi
            this.setContent {  }
        }
    }
}