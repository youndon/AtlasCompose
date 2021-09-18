package atlasCompose.ui

import androidx.compose.ui.window.v1.DialogProperties

private class DialogProperties {
    init {
        DialogProperties().apply {
            this.centered
            this.events
            this.icon
            this.location
            this.menuBar
            this.resizable
            this.size
            this.title
            this.undecorated
        }
    }
}