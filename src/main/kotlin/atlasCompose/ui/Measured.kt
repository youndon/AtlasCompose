package atlasCompose.ui

import androidx.compose.ui.layout.Measured

private interface Measured {
    val Measured.ss: Any
        get() = this.apply {
            this.measuredHeight
            this.measuredWidth
        }
}