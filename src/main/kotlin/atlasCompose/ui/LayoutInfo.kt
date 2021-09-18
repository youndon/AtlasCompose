package atlasCompose.ui

import androidx.compose.ui.layout.LayoutInfo

private interface LayoutInfo {
    val LayoutInfo.ss: Any
        get() = this.apply {
            this.coordinates
            this.height
            this.width
            this.isAttached
            this.isPlaced
            this.parentInfo
            this.getModifierInfo()
        }
}