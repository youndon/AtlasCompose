package atlasCompose.material

import androidx.compose.material.BottomSheetValue

private enum class BottomSheetValue {

    /**
     * The bottom sheet is visible, but only showing its peek height.
     */
    Collapsed,

    /**
     * The bottom sheet is visible at its maximum height.
     */
    Expanded
}