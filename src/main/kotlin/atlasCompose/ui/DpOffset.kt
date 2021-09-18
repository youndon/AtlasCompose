package atlasCompose.ui

import androidx.compose.ui.unit.DpOffset

private class DpOffset {
    val DpOffset.ss: Any
        get() = this.apply {
            this.x
            this.y
            this.minus(DpOffset.Zero)
            this.plus(DpOffset.Zero)
        }

    init {
        DpOffset.Companion.Zero
    }
}