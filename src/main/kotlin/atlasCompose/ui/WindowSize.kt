package atlasCompose.ui

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.window.WindowSize

private class WindowSize {
    init {
        WindowSize(Dp.Hairline,Dp.Hairline).apply {
            this.height
            this.width
        }
    }
}