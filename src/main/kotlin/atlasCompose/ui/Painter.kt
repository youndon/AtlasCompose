package atlasCompose.ui

import androidx.compose.ui.graphics.painter.Painter

private abstract class Painter {
   private val Painter.ss: Any
        get() = this.intrinsicSize
}