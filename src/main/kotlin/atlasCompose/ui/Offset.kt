package atlasCompose.ui

import androidx.compose.ui.geometry.*
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.round

private class Offset {
    init {
        Offset.apply {
            this.Infinite
            this.Unspecified
            this.Zero
        }
        Offset(1f,1f).apply {
            this.x
            this.y
            this.component1()
            this.component2()
//            this.div()
            this.getDistance()
            this.getDistanceSquared()
            this.isValid()
//            this.minus()
//            this.plus()
//            this.rem()
//            this.times()
            this.unaryMinus()
            this.isFinite
            this.isSpecified
            this.isUnspecified
//            this.takeOrElse {  }
            this.round()
        }
    }
}