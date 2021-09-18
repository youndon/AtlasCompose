package atlasCompose.ui

import androidx.compose.ui.unit.TextUnitType

private class TextUnitType {
    init {
        TextUnitType.Companion.apply {
            this.Em
            this.Sp
            this.Unspecified
        }
    }
}