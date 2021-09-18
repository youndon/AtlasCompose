package atlasCompose.ui

import androidx.compose.ui.graphics.colorspace.Adaptation

private abstract class Adaptation {
    init {
        Adaptation.apply {
            this.Bradford
            this.Ciecat02
            this.VonKries
        }
    }
}