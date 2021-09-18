package atlasCompose.ui

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.text.input.PlatformTextInputService
import androidx.compose.ui.text.input.TextFieldValue

private interface PlatformTextInputService {
    val PlatformTextInputService.ss: Any
        get() = this.apply {
            this.hideSoftwareKeyboard()
            this.notifyFocusedRect(Rect.Zero)
            this.showSoftwareKeyboard()
//            this.startInput()
            this.updateState(TextFieldValue(), TextFieldValue())
        }
}