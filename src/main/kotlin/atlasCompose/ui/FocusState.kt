package atlasCompose.ui

import androidx.compose.ui.focus.FocusState

private interface FocusState {
    val FocusState.ss: Any
        get() = this.apply {
            this.hasFocus
            this.isCaptured
            this.isFocused
        }
}