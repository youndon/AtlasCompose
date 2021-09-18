package atlasCompose.ui

import androidx.compose.ui.graphics.ColorMatrix

private class ColorMatrix {
    init {
        ColorMatrix().apply {
            this.values
            this.convertRgbToYuv()
            this.convertYuvToRgb()
            this[1, 1]
            this.reset()
            this.set(ColorMatrix())
            this.setToRotateBlue(1f)
            this.setToRotateGreen(1f)
            this.setToRotateRed(1f)
            this.setToSaturation(1f)
            this.setToScale(1f,1f,1f,1f)
            this.timesAssign(ColorMatrix())
        }
    }
}