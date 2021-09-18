package atlasCompose.material

import androidx.compose.material.BackdropScaffoldDefaults

private object BackdropScaffoldDefaults {
    init {
        BackdropScaffoldDefaults.apply {
            this.FrontLayerElevation
            this.HeaderHeight
            this.PeekHeight
//            this.frontLayerScrimColor
//            this.frontLayerShape
        }
    }
}