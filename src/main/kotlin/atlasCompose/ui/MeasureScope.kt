package atlasCompose.ui

import androidx.compose.ui.layout.MeasureScope

private interface MeasureScope {
    val MeasureScope.ss: Any get() = layout(1, 1, mapOf()) {}
}