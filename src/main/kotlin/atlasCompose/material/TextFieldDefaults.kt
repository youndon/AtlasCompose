package atlasCompose.material

import androidx.compose.material.TextFieldDefaults

private object TextFieldDefaults {
    init {
        TextFieldDefaults.apply {
            this.BackgroundOpacity
            this.IconOpacity
            this.MinHeight
            this.MinWidth
            this.UnfocusedIndicatorLineOpacity
//            this.outlinedTextFieldColors()
//            this.textFieldColors()
        }
    }
}