package atlasCompose.ui

import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.VisibilityThreshold
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.isFinite
import androidx.compose.ui.unit.isSpecified
import androidx.compose.ui.unit.isUnspecified

private class Dp {
    val Dp.ss: Any
        get() = this.apply {
//        this.div()
//        this.minus()
//        this.plus()
//        this.times()
            this.unaryMinus()
            this.isFinite
            this.isSpecified
            this.isUnspecified
//        this.coerceAtLeast()
//        this.coerceAtMost()
//        this.coerceIn()
//        this.takeOrElse {  }
        }

    init {
        Dp.apply {
            this.Hairline
            this.Infinity
            this.Unspecified
            this.VectorConverter
            this.VisibilityThreshold
        }
    }
}