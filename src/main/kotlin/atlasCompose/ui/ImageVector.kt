package atlasCompose.ui

import androidx.compose.ui.graphics.vector.ImageVector

private class ImageVector {
    private val ImageVector.ss: Any
        get() = this.apply {
            this.defaultHeight
            this.defaultWidth
            this.name
            this.root
            this.tintBlendMode
            this.tintColor
            this.viewportHeight
            this.viewportWidth
        }
}