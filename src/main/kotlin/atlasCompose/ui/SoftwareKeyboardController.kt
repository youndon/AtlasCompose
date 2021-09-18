package atlasCompose.ui

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.SoftwareKeyboardController

private interface SoftwareKeyboardController {
    @OptIn(ExperimentalComposeUiApi::class)
    val SoftwareKeyboardController.ss: Any
        get() = this.apply {
            this.hide()
            this.show()
        }
}