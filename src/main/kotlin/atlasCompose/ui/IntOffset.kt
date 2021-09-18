package atlasCompose.ui

import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.toOffset

private class IntOffset {
    val IntOffset.ss:Any get() = this.apply {
        this.x
        this.y
        this.component1()
        this.component2()
        this.div(1f)
        this.minus(IntOffset.Zero)
        this.plus(IntOffset.Zero)
        this.rem(1)
        this.times(1f)
        this.unaryMinus()
        this.toOffset()
    }
    init {
        IntOffset.Companion.Zero
    }
}