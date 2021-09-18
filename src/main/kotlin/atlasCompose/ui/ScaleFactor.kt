package atlasCompose.ui

import androidx.compose.ui.layout.ScaleFactor
import androidx.compose.ui.layout.isSpecified
import androidx.compose.ui.layout.isUnspecified
import androidx.compose.ui.layout.takeOrElse

private class ScaleFactor {
    val ScaleFactor.ss: Any
        get() = this.apply {
            this.scaleX
            this.scaleY
            this.component1()
            this.component2()
//        this.div()
//        this.times()
            this.isSpecified
            this.isUnspecified
//        this.takeOrElse {  }
        }

    init {
        ScaleFactor.Companion.Unspecified
    }
}