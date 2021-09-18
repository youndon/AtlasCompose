package atlasCompose.material

import androidx.compose.material.AppBarDefaults

private object AppBarDefaults {
    init {
        AppBarDefaults.apply {
            this.BottomAppBarElevation
            this.ContentPadding
            this.TopAppBarElevation
        }
    }
}