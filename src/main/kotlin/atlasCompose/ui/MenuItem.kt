package atlasCompose.ui

import androidx.compose.ui.window.v1.MenuItem

private class MenuItem {
    val MenuItem.ss: Any
        get() = this.apply {
            this.action
            this.name
            this.shortcut
        }
}