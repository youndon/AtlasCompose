package atlasCompose.ui

import androidx.compose.ui.graphics.TileMode

private class TileMode {
    init {
        TileMode.Companion.apply {
            this.Clamp
            this.Mirror
            this.Repeated
        }
    }
}