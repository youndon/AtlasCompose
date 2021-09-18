package atlasCompose.ui

import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusManager

private interface FocusManager {
    val FocusManager.ss: Any
        get() = this.apply {
            this.clearFocus()
            this.moveFocus(FocusDirection.Next)
        }
}