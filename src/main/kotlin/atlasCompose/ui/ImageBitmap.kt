package atlasCompose.ui

import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asDesktopBitmap
import androidx.compose.ui.graphics.toPixelMap

private interface ImageBitmap {
    val ImageBitmap.ss:Any
    get() = this.apply {
        this.colorSpace
        this.config
        this.hasAlpha
        this.height
        this.width
        this.prepareToDraw()
        this.readPixels(intArrayOf())
        this.asDesktopBitmap()
        this.toPixelMap()
    }
}