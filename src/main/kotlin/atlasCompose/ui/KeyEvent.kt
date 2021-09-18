package atlasCompose.ui

import androidx.compose.foundation.text.isTypedEvent
import androidx.compose.ui.input.key.*
import androidx.compose.ui.input.key.KeyEvent

private class KeyEvent {
    val KeyEvent.ss: Any
        get() = this.apply {
            this.nativeKeyEvent // parameter!
            this.isAltPressed
            this.isCtrlPressed
            this.isMetaPressed
            this.isShiftPressed
            this.isTypedEvent
            this.key
            this.type
            this.utf16CodePoint
        }
}