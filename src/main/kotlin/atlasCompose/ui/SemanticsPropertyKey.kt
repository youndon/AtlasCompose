package atlasCompose.ui

import androidx.compose.ui.semantics.SemanticsPropertyKey

private class SemanticsPropertyKey {
    val <T> SemanticsPropertyKey<T>.ss: Any
        get() = this.apply {
//            this.merge()
//            this.getValue()
//            this.setValue()
        }
}