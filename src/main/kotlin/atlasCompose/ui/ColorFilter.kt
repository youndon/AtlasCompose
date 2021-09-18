package atlasCompose.ui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix

private class ColorFilter {
    init {
        ColorFilter.apply {
            this.colorMatrix(ColorMatrix())
            this.lighting(Color.Blue, Color.Gray)
            this.tint(Color.Magenta)
        }
    }
}