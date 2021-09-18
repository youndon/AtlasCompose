package atlasCompose.ui

import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.isSpecified
import androidx.compose.ui.unit.isUnspecified

private class TextUnit {
   private val TextUnit.ss: Any
        get() = this.apply {
            this.isEm
            this.isSp
            this.type
            this.value
            this.div(1)
            this.times(1)
            this.unaryMinus()
            this.isSpecified
            this.isUnspecified
//        this.takeOrElse {  }
        }

    init {
        TextUnit.Companion.Unspecified
    }
}