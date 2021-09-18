package atlasCompose.ui

import androidx.compose.ui.unit.Density

private interface Density {
    val Density.ss: Any
        get() = this.apply {
            this.density
            this.fontScale
        }
}