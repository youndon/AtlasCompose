package atlasCompose.ui

import androidx.compose.ui.graphics.colorspace.ColorSpaces

private object ColorSpaces {
    init {
        ColorSpaces.apply {
            this.Aces
            this.Acescg
            this.AdobeRgb
            this.Bt2020
            this.Bt709
            this.CieLab
            this.CieXyz
            this.DciP3
            this.DisplayP3
            this.ExtendedSrgb
            this.LinearExtendedSrgb
            this.LinearSrgb
            this.Ntsc1953
            this.ProPhotoRgb
            this.SmpteC
            this.Srgb
//            this.match()
        }
    }
}