package atlasCompose.ui

import androidx.compose.ui.text.input.KeyboardType

private class KeyboardType {
    init {
        KeyboardType.apply {
            this.Ascii
            this.Email
            this.Number
            this.NumberPassword
            this.Password
            this.Phone
            this.Text
            this.Uri
        }
    }
}