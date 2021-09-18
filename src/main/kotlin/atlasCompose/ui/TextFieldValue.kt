package atlasCompose.ui

import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.getSelectedText
import androidx.compose.ui.text.input.getTextAfterSelection
import androidx.compose.ui.text.input.getTextBeforeSelection

private class TextFieldValue {
    val TextFieldValue.ss: Any
        get() = this.apply {
            this.composition
            this.selection
            this.text
            this.getSelectedText()
            this.getTextAfterSelection(1)
            this.getTextBeforeSelection(1)
        }

    init {
        TextFieldValue.Companion.Saver
    }
}