package compose.foundation

import androidx.compose.foundation.text.KeyboardActions

private class KeyboardActions {
    init {
        // those parameters:
        KeyboardActions().apply {
            this.onDone
            this.onGo
            this.onNext
            this.onPrevious
            this.onSearch
            this.onSend
        }
    }
}