package atlasCompose.ui

import androidx.compose.ui.semantics.SemanticsNode

private class SemanticsNode {
        val SemanticsNode.ss:Any
        get() = this.apply {
            this.boundsInRoot
            this.boundsInWindow
            this.children
            this.config
            this.id
            this.isRoot
            this.layoutInfo
            this.parent
            this.positionInRoot
            this.positionInWindow
            this.root
            this.size
//            this.getAlignmentLinePosition()

        }
}
