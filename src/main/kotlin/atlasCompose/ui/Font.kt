package atlasCompose.ui

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily

private interface Font {
    val Font.ss: Any
        get() = this.apply {
            this.style
            this.weight
            this.toFontFamily()
        }
}