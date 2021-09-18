package atlasCompose.ui

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalSoftwareKeyboardController

@OptIn(ExperimentalComposeUiApi::class)
private object LocalSoftwareKeyboardController {
    init {
        LocalSoftwareKeyboardController.apply {
//            this.current
//            this.provides()
        }
    }
}