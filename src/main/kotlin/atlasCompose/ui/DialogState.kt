package atlasCompose.ui

import androidx.compose.ui.window.DialogState

private class DialogState {
    val DialogState.ss:Any get() = this.apply {
        // those parameters:
//        this.isOpen
//        this.isVisible
        this.position
        this.size
    }
    init {
//        DialogState.Companion.Saver
    }
}