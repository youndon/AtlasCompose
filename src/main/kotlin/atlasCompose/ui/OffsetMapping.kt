package atlasCompose.ui

import androidx.compose.ui.text.input.OffsetMapping

private interface OffsetMapping {
    val OffsetMapping.ss: Any
        get() = this.apply {
            this.originalToTransformed(1)
            this.transformedToOriginal(1)
        }
}