package atlasCompose.ui

import androidx.compose.ui.graphics.StrokeJoin

private class StrokeJoin {
    init {
        StrokeJoin.Companion.apply {
            this.Bevel
            this.Miter
            this.Round
        }
    }
}