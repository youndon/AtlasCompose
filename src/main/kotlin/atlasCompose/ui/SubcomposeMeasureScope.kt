package atlasCompose.ui

import androidx.compose.ui.layout.SubcomposeMeasureScope

private interface SubcomposeMeasureScope {
    val SubcomposeMeasureScope.ss: Any
        get() = this.subcompose("") { }
}