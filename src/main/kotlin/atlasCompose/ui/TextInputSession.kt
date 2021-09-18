package atlasCompose.ui

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.TextInputSession

private class TextInputSession {
    private val TextInputSession.ss: Any
        get() = this.apply {
            this.isOpen
            this.dispose()
            this.hideSoftwareKeyboard()
            this.notifyFocusedRect(Rect.Zero)
            this.showSoftwareKeyboard()
            this.updateState(TextFieldValue(),TextFieldValue())
        }
}