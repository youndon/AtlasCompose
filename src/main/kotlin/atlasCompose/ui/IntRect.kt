package atlasCompose.ui

import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect

private class IntRect {
    val IntRect.ss:Any get() = this.apply {
        this.bottom
        this.bottomCenter
        this.bottomLeft
        this.bottomRight
        this.center
        this.centerLeft
        this.centerRight
        this.height
        this.width
        this.left
        this.right
        this.maxDimension
        this.minDimension
        this.size
        this.top
        this.topCenter
        this.topLeft
        this.topRight
        this.contains(IntOffset.Zero)
        this.deflate(1)
        this.inflate(1)
        this.intersect(IntRect.Zero)
        this.overlaps(IntRect.Zero)
        this.translate(IntOffset.Zero)
    }
    init {
        IntRect.Companion.Zero
    }
}