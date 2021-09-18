package atlasCompose.ui

import androidx.compose.ui.text.input.DeleteSurroundingTextCommand

private class DeleteSurroundingTextCommand {
    init {
        DeleteSurroundingTextCommand(1,1).apply {
            this.lengthAfterCursor
            this.lengthBeforeCursor
        }
    }
}