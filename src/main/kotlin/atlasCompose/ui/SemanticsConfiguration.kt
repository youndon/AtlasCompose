package atlasCompose.ui

import androidx.compose.ui.semantics.SemanticsConfiguration

private class SemanticsConfiguration {
    init {
        SemanticsConfiguration().apply {
            this.isClearingSemantics
            this.isMergingSemanticsOfDescendants
//            this.contains()
        }
    }
}