package atlasCompose.ui

import androidx.compose.ui.text.input.ImeOptions
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.TextInputService

private class TextInputService {
       private val TextInputService.ss:Any
        get() = this.apply {
            this.hideSoftwareKeyboard()
            this.showSoftwareKeyboard()
            this.startInput(TextFieldValue(), ImeOptions.Default,{},{})
//            this.stopInput()
        }
}