package atlasCompose.ui

import androidx.compose.ui.text.TextRange


private class TextRange {
    private val TextRange.ss: Any
        get() = this.apply {
            this.collapsed
            this.end
            this.length
            this.max
            this.min
            this.reversed
            this.start
            this.contains(1)
            this.intersects(this)
        }
}