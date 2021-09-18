package atlasCompose.runtime

import androidx.compose.runtime.tooling.CompositionData

private interface CompositionData {
    val CompositionData.ss: Any
        get() = this.apply {
            this.compositionGroups
            this.isEmpty
        }
}