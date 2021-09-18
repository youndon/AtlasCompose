package atlasCompose.ui

import androidx.compose.ui.graphics.colorspace.ColorSpace
import androidx.compose.ui.graphics.colorspace.connect

private abstract class ColorSpace {
    val ColorSpace.ss: Any
        get() = this.apply {
            this.componentCount
            this.isSrgb
            this.isWideGamut
            this.model
            this.name
//      this.fromXyz()
//      this.getMaxValue()
//      this.getMinValue()
//      this.toXyz()
//      this.adapt()
            this.connect()
        }
}