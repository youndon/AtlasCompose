package atlasCompose.ui

import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.text.AnnotatedString

private interface ClipboardManager {
    val ClipboardManager.ss: Any
        get() = this.setText(AnnotatedString(""))
}