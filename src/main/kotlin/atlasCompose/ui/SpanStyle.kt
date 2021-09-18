package atlasCompose.ui

import androidx.compose.ui.text.SpanStyle

private class SpanStyle {
    init {
        SpanStyle().apply {
            // parameters!!
            this.color
            this.fontSize
            this.fontWeight
            this.fontStyle
            this.fontSynthesis
            this.fontFamily
            this.fontFeatureSettings
            this.letterSpacing
            this.baselineShift
            this.textGeometricTransform
            this.localeList
            this.background
            this.textDecoration
            this.shadow

            // block
            this.copy()
            this.merge()
            this.plus(this)
        }
    }
}