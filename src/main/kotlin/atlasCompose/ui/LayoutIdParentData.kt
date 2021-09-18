package atlasCompose.ui

import androidx.compose.ui.layout.LayoutIdParentData

private interface LayoutIdParentData {
    val LayoutIdParentData.ss: Any
        get() = this.layoutId
}