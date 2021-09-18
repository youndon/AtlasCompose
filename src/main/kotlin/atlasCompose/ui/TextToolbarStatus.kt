package atlasCompose.ui

import androidx.compose.ui.platform.TextToolbar
import androidx.compose.ui.platform.TextToolbarStatus

private enum class TextToolbarStatus {
    /**
     * The [TextToolbar] is shown.
     */
    Shown,
    /**
     * The [TextToolbar] is hidden.
     */
    Hidden
}