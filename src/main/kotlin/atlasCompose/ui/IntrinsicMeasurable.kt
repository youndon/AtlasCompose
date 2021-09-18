package atlasCompose.ui

import androidx.compose.ui.layout.IntrinsicMeasurable

private interface IntrinsicMeasurable {
    val IntrinsicMeasurable.ss: Any
        get() = this.apply {
            this.parentData
            this.maxIntrinsicHeight(1)
            this.maxIntrinsicWidth(1)
            this.minIntrinsicHeight(1)
            this.minIntrinsicWidth(1)
        }
}