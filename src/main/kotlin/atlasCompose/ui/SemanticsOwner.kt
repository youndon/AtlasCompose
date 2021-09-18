package atlasCompose.ui

import androidx.compose.ui.semantics.SemanticsOwner
import androidx.compose.ui.semantics.getAllSemanticsNodes

private class SemanticsOwner {
    val SemanticsOwner.ss: Any
        get() = this.apply {
            this.rootSemanticsNode
            this.unmergedRootSemanticsNode
            this.getAllSemanticsNodes(false)
        }
}