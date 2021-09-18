package atlasCompose.ui

import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.center
import androidx.compose.ui.unit.toIntRect
import androidx.compose.ui.unit.toSize

private class IntSize {
    val IntSize.ss: Any
        get() = this.apply {
            this.height
            this.width
            this.component1()
            this.component2()
            this.div(1)
            this.times(1)
            this.center
            this.toIntRect()
            this.toSize()
        }

    init {
        IntSize.Companion.Zero
    }
}