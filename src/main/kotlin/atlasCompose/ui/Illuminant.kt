package atlasCompose.ui

import androidx.compose.ui.graphics.colorspace.Illuminant

private object Illuminant {
    init {
        Illuminant.apply {
            this.A
            this.B
            this.C
            this.D50
            this.D55
            this.D60
            this.D65
            this.D75
            this.E
        }
    }
}