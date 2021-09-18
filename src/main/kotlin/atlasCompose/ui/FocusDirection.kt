package atlasCompose.ui

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.focus.FocusDirection

@OptIn(ExperimentalComposeUiApi::class)
private class FocusDirection {
    init {
        FocusDirection.apply {
            this.Up
            this.Down
            this.In
            this.Out
            this.Left
            this.Right
            this.Next
            this.Previous
        }
    }
}