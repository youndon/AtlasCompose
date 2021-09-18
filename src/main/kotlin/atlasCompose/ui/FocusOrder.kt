package atlasCompose.ui

import androidx.compose.ui.focus.FocusOrder

private class FocusOrder {
    init {
        FocusOrder().apply {
            this.down
            this.up
            this.start
            this.end
            this.left
            this.right
            this.next
            this.previous
        }
    }
}