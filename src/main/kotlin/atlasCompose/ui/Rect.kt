package atlasCompose.ui

import androidx.compose.runtime.Stable
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.toSkijaRect

private class Rect {
    val Rect.ss: Any
        get() = this.apply {
            // parameters:
            /**
             * The offset of the left edge of this rectangle from the x axis.
             */
            this.left
            /**
             * The offset of the top edge of this rectangle from the y axis.
             */
            this.top
            /**
             * The offset of the right edge of this rectangle from the x axis.
             */
            this.right
            /**
             * The offset of the bottom edge of this rectangle from the y axis.
             */
            this.bottom

            // block:
            this.bottomCenter
            this.bottomLeft
            this.bottomRight
            this.center
            this.centerLeft
            this.centerRight
            this.height
            this.width
            this.isEmpty
            this.isFinite
            this.isInfinite
            this.maxDimension
            this.minDimension
            this.size
            this.topCenter
            this.topLeft
            this.topRight
//       this.contains()
//       this.deflate()
//       this.inflate()
//       this.intersect()
//       this.overlaps()
//       this.translate()
            this.toSkijaRect()
        }
}