package atlasCompose.ui

import androidx.compose.ui.layout.IntrinsicMeasureScope

private interface IntrinsicMeasureScope {
    val IntrinsicMeasureScope.ss: Any
        get() = this.apply {
            this.layoutDirection
        }
}