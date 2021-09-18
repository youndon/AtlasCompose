package atlasCompose.ui

import androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand

private class DeleteSurroundingTextInCodePointsCommand {
    init {
        DeleteSurroundingTextInCodePointsCommand(1,1).apply {
            this.lengthAfterCursor
            this.lengthBeforeCursor
        }
    }
}