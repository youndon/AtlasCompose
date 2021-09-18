package atlasCompose.ui

import androidx.compose.ui.text.ParagraphStyle

class ParagraphStyle {
    init {
        ParagraphStyle().apply {
            // parameters:
            this.lineHeight
            this.textAlign
            this.textDirection
            this.textIndent

            //
            this.merge()
            this.plus(this)
        }
    }
}