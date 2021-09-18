package atlasCompose.ui

import androidx.compose.ui.window.Notifier

private class Notifier {
    init {
        Notifier().apply {
            this.error("","")
            this.notify("","")
            this.warn("","")
        }
    }
}