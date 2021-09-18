package atlasCompose.ui

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.Typeface

private interface Typeface {
    val Typeface.ss: FontFamily?
        get() = this.fontFamily
}