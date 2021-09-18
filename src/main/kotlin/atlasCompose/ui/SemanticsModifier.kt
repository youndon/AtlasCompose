package atlasCompose.ui

import androidx.compose.ui.semantics.SemanticsModifier

private interface SemanticsModifier {
    val SemanticsModifier.ss: Any
        get() = this.apply {
            this.id
            this.semanticsConfiguration
        }
}