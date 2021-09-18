package atlasCompose.material

import androidx.compose.material.TabRowDefaults

private object TabRowDefaults {
    init {
        TabRowDefaults.apply {
            this.DividerOpacity
//            this.Divider()
            this.DividerThickness
            this.IndicatorHeight
            this.ScrollableTabRowPadding
        }
    }
}