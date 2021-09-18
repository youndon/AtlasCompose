package atlasCompose.ui

import androidx.compose.ui.geometry.MutableRect
import androidx.compose.ui.geometry.Offset

private class MutableRect {
    init {
        MutableRect(1f, 1f, 1f, 1f).apply {
            this.height
            this.width
            this.size
            this.isEmpty
            this.contains(Offset.Zero)
            this.intersect(1f, 1f, 1f, 1f)
        }
    }
}