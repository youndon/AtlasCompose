package atlasCompose.ui

import androidx.compose.ui.text.input.ImeAction

private class ImeAction {
    init {
        ImeAction.apply {
            this.Default
            this.Done
            this.Go
            this.Next
            this.None
            this.Previous
            this.Search
            this.Send
        }
    }
}