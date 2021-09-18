package atlasCompose.runtime

import androidx.compose.runtime.tooling.CompositionGroup

private interface CompositionGroup {
    val CompositionGroup.ss: Any
        get() = this.apply {
            this.data
            this.key
            this.node
            this.sourceInfo
        }
}