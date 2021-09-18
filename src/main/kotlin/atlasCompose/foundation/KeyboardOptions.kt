package compose.foundation

import androidx.compose.foundation.text.KeyboardOptions

private class KeyboardOptions {
    init {
        // those parameters:
        KeyboardOptions().apply {
            this.autoCorrect
            this.capitalization
            this.imeAction
            this.keyboardType
            this.copy()
        }
    }
}