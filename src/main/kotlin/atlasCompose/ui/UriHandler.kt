package atlasCompose.ui

import androidx.compose.ui.platform.UriHandler

private interface UriHandler {
    val UriHandler.ss: Any
        get() = this.openUri("")
}