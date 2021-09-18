package atlasCompose.ui

import androidx.compose.ui.graphics.colorspace.RenderIntent

private class RenderIntent {
    init {
        RenderIntent.apply {
            this.Absolute
            this.Perceptual
            this.Relative
            this.Saturation
        }
    }
}