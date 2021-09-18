package atlasCompose.ui

import androidx.compose.ui.text.style.TextDecoration

private class TextDecoration {
    init {
        TextDecoration.apply {
            this.LineThrough
            this.None
            this.Underline
            this.combine(listOf())
        }
    }
}