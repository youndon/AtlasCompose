package atlasCompose.material

import androidx.compose.material.BottomSheetScaffoldDefaults

private object BottomSheetScaffoldDefaults {
    init {
        BottomSheetScaffoldDefaults.apply {
            this.SheetElevation
            this.SheetPeekHeight
        }
    }
}