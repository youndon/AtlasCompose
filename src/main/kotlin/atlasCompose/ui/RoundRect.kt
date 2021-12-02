package atlasCompose.ui

import androidx.compose.ui.geometry.*
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.toSkijaRRect

private class RoundRect {
    val RoundRect.ss: Any
        get() = this.apply {
            // parameters:
            /** The offset of the left edge of this rectangle from the x axis */
            this.left
            /** The offset of the top edge of this rectangle from the y axis */
            this.top
            /** The offset of the right edge of this rectangle from the x axis */
            this.right
            /** The offset of the bottom edge of this rectangle from the y axis */
            this.bottom
            /** The top-left radius */
            this.topLeftCornerRadius
            /** The top-right radius */
            this.topRightCornerRadius
            /** The bottom-right radius */
            this.bottomRightCornerRadius
            /** The bottom-left radius */
            this.bottomLeftCornerRadius

            // block:
            this.contains(Offset.Zero)
            this.height
            this.width
            this.boundingRect
            this.center
            this.isCircle
            this.isEllipse
            this.isEmpty
            this.isFinite
            this.isRect
            this.isSimple
            this.maxDimension
            this.minDimension
            this.safeInnerRect
            this.translate(Offset.Zero)
            this.toSkijaRRect()
        }
}