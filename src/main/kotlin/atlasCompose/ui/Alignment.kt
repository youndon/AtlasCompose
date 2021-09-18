package atlasCompose.ui

import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection

private interface Alignment {
    val Alignment.ss: Any
        get() = this.align(IntSize.Zero, IntSize.Zero, LayoutDirection.Ltr)

    companion object {
        init {
            Alignment.apply {
                this.Bottom
                this.BottomCenter
                this.BottomEnd
                this.BottomStart
                this.Center
                this.CenterEnd
                this.CenterHorizontally
                this.CenterStart
                this.CenterVertically
                this.End
                this.Start
                this.Top
                this.TopCenter
                this.TopEnd
                this.TopStart
            }
        }
    }
}