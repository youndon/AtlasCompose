package atlasCompose.ui

import androidx.compose.ui.text.TextLayoutInput

private class TextLayoutInput {
    val TextLayoutInput.ss: Any
        get() = this.apply {
            // parameters:
            this.constraints
            this.density
            this.layoutDirection
            this.maxLines
            this.overflow
            this.placeholders
            this.resourceLoader
            this.softWrap
            this.style
            this.text
        }
}