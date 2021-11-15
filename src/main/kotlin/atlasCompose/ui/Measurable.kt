package atlasCompose.ui

import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.layoutId

private interface Measurable {
    val Measurable.ss: Any
        get() = this.apply {
//            this.measure()
            this.layoutId
        }
}
