package atlasCompose.material

import androidx.compose.material.ButtonDefaults
private object ButtonDefaults {
    init {
        ButtonDefaults.apply {
            this.ContentPadding
            this.IconSize
            this.IconSpacing
            this.MinHeight
            this.MinWidth
            this.OutlinedBorderOpacity
            this.OutlinedBorderSize
            this.TextButtonContentPadding
//            this.buttonColors()
//            this.elevation()
//            this.outlinedButtonColors()
//            this.textButtonColors()
        }
    }
}