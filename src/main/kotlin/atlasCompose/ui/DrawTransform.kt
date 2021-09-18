package atlasCompose.ui

import androidx.compose.ui.graphics.drawscope.DrawTransform
import androidx.compose.ui.graphics.drawscope.inset
import androidx.compose.ui.graphics.drawscope.rotateRad
import androidx.compose.ui.graphics.drawscope.scale

private interface DrawTransform {
    val DrawTransform.ss: Any
        get() = this.apply {
            this.center
            this.size
//       this.clipPath()
            this.clipRect()
            this.inset()
//       this.rotate()
//       this.scale()
//       this.transform()
            this.translate()
//       this.rotateRad()
        }
}