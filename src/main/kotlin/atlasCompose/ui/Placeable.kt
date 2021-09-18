package atlasCompose.ui

import androidx.compose.ui.layout.Placeable

private abstract class Placeable {
    val Placeable.ss: Any
        get() = this.apply {
            this.height
            this.width
        }
}