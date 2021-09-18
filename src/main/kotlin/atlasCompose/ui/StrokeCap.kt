package atlasCompose.ui

import androidx.compose.ui.graphics.StrokeCap

private class StrokeCap {
    init {
        StrokeCap.Companion.apply {
            this.Butt
            this.Round
            this.Square
        }
    }
}