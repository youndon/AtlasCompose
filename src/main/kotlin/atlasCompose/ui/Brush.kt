package atlasCompose.ui

import androidx.compose.ui.graphics.Brush

private class Brush {
    init {
        Brush.apply {
            this.horizontalGradient()
            this.linearGradient()
            this.radialGradient()
            this.sweepGradient()
            this.verticalGradient()
        }
    }
}