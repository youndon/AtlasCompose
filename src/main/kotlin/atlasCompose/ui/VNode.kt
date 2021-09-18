package atlasCompose.ui

import androidx.compose.ui.graphics.vector.VNode

private class VNode {
   private val VNode.ss: Any
        get() = this.invalidate()
}