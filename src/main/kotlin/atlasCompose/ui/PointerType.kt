package atlasCompose.ui

import androidx.compose.ui.input.pointer.PointerType

private class PointerType {
    init {
        PointerType.apply {
            this.Eraser
            this.Mouse
            this.Stylus
            this.Touch
            this.Unknown
        }
    }
}