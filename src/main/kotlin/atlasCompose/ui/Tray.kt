package atlasCompose.ui

import androidx.compose.ui.window.v1.Tray

private class Tray {
    init {
        Tray().apply {
            this.error("", "")
//            this.icon()
            this.menu()
            this.notify("", "")
            this.remove()
            this.warn("", "")
        }
    }
}