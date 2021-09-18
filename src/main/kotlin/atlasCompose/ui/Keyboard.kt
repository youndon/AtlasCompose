package atlasCompose.ui

import androidx.compose.ui.platform.Keyboard

private class Keyboard {
    init {
        Keyboard().apply {
            this.onKeyEvent
            this.onPreviewKeyEvent
        }
    }
}