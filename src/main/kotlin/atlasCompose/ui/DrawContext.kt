package atlasCompose.ui

import androidx.compose.ui.graphics.drawscope.DrawContext

private interface DrawContext {
    val DrawContext.ss: Any
        get() = this.apply {
            this.canvas
            this.size
            this.transform
        }
}