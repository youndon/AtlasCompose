package atlasCompose.ui

import androidx.compose.ui.input.key.KeyEventType

private class KeyEventType {
    init {
        KeyEventType.apply {
            this.KeyDown
            this.KeyUp
            this.Unknown
        }
    }
}