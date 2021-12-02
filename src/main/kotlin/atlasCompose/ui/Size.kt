package atlasCompose.ui

import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.VisibilityThreshold
import androidx.compose.ui.geometry.*
import androidx.compose.ui.geometry.Size

private class Size {
    init {
        Size.Companion.apply {
            this.Unspecified
            this.Zero
            this.VectorConverter
            this.VisibilityThreshold
        }
    }

    val Size.ss: Any
        get() = this.apply {
            this.height
            this.width
            this.maxDimension
            this.minDimension
            this.component1()
            this.component2()
            this.isEmpty()
//        this.div()
//        this.times()
            this.center
            this.isSpecified
            this.isUnspecified
//        this.takeOrElse {  }
            this.toRect()
        }
}