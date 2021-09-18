package atlasCompose.ui

import androidx.compose.ui.graphics.colorspace.ColorModel

private class ColorModel {
    init {
        ColorModel.apply {
            this.Cmyk
            this.Lab
            this.Rgb
            this.Xyz
        }
    }
}