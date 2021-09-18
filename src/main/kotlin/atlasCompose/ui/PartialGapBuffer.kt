package atlasCompose.ui

import androidx.compose.ui.text.InternalTextApi
import androidx.compose.ui.text.input.PartialGapBuffer

private class PartialGapBuffer {
    @OptIn(InternalTextApi::class)
    val PartialGapBuffer.ss: Any
        get() = this.apply {
            this.length
            this.replace(1, 1, "")
        }
}