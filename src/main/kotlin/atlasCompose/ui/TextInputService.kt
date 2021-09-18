package atlasCompose.ui

import androidx.compose.ui.text.input.ImeOptions
import androidx.compose.ui.text.input.PlatformTextInputService
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.TextInputService
import androidx.compose.ui.text.input.TextInputSession

private class TextInputService {
       private val TextInputService.ss:Any
        get() = this.apply {
            this.hideSoftwareKeyboard()
            this.showSoftwareKeyboard()
            this.startInput(TextFieldValue(), ImeOptions.Default,{},{})
//            this.stopInput()
        }
}