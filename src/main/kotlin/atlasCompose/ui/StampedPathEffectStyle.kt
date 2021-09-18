package atlasCompose.ui

import androidx.compose.ui.graphics.StampedPathEffectStyle

private class StampedPathEffectStyle {
    init {
        StampedPathEffectStyle.Companion.apply {
            this.Morph
            this.Rotate
            this.Translate
        }
    }
}