package atlasCompose.ui

import androidx.compose.ui.unit.Constraints

class Constraints {
    init {
        Constraints.apply {
            this.Infinity
            this.fixed(1,1)
            this.fixedHeight(1)
            this.fixedWidth(1)
        }
    }
}