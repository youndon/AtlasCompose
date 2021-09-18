package atlasCompose.ui

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.focus.FocusRequester

@OptIn(ExperimentalComposeUiApi::class)
private class FocusRequester {
    init {
        FocusRequester.apply {
            this.Default
            this.createRefs()
        }
    }
}