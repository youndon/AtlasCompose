package atlasCompose.ui

import androidx.compose.ui.unit.Velocity

private class Velocity {

    init {
        Velocity.Companion.Zero

        Velocity(1f,1f).apply {
            this.x
            this.y
            this.component1()
            this.component2()
//        this.div()
//        this.minus()
//        this.plus()
//        this.rem()
//        this.times()
            this.unaryMinus()
        }
    }
}