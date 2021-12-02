package atlasCompose.ui

import androidx.compose.ui.layout.*
import androidx.compose.ui.layout.LayoutCoordinates

private interface LayoutCoordinates {
    val LayoutCoordinates.ss: Any
        get() = this.apply {
            this.isAttached
            this.parentCoordinates
            this.parentLayoutCoordinates
            this.providedAlignmentLines
            this.size
//            this.localBoundingBoxOf()
//            this.localPositionOf()
//            this.localToRoot()
//            this.localToWindow()
//            this.windowToLocal()
            this.boundsInParent()
            this.boundsInRoot()
            this.boundsInWindow()
            this.positionInParent()
            this.positionInRoot()
            this.positionInWindow()
        }
}