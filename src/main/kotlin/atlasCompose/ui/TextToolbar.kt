package atlasCompose.ui

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.platform.TextToolbar

private interface TextToolbar {
    val TextToolbar.ss: Any
        get() = this.apply {
            this.status
            this.hide()
            this.showMenu(Rect.Zero)
        }
}