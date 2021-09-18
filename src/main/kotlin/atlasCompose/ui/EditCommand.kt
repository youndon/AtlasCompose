package atlasCompose.ui

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.EditCommand
import androidx.compose.ui.text.input.EditingBuffer

private interface EditCommand {
    val EditCommand.ss: Any
//        get() = applyTo()
}