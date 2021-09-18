package atlasCompose.ui

import androidx.compose.ui.platform.ViewConfiguration

private interface ViewConfiguration {
    val ViewConfiguration.ss: Any
        get() = this.apply {
            this.doubleTapMinTimeMillis
            this.longPressTimeoutMillis
            this.touchSlop
        }
}