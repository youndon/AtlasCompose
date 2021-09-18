package atlasCompose.ui

import androidx.compose.ui.geometry.CornerRadius

private class CornerRadius {
    val CornerRadius.ss:Any get() = this.apply {
        this.x
        this.y
        this.component1()
        this.component2()
        this.copy()
        this.div(1f)
        this.minus(CornerRadius.Zero)
        this.plus(CornerRadius.Zero)
        this.times(1f)
        this.unaryMinus()
    }
    init {
        CornerRadius.Companion.Zero
    }
}