package atlasCompose.ui

import androidx.compose.ui.layout.MeasureResult

private interface MeasureResult {
    val MeasureResult.ss: Any
        get() = this.apply {
            this.alignmentLines
            this.height
            this.width
            this.placeChildren()
        }
}