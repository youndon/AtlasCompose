package atlasCompose.ui

import androidx.compose.ui.text.TextStyle

private class TextStyle {
    private val TextStyle.ss: Any
        get() = this.apply {
            // parameters:
            color
            fontSize
            fontWeight
            fontStyle
            fontSynthesis
            fontFamily
            fontFeatureSettings
            letterSpacing
            baselineShift
            textGeometricTransform
            localeList
            background
            textDecoration
            shadow
            textAlign
            textDirection
            lineHeight
            textIndent

            // block:
            this.merge()
            this.plus(this)
            this.toParagraphStyle()
            this.toSpanStyle()
        }
}