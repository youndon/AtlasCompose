package atlasCompose.ui

import androidx.compose.ui.layout.OnRemeasuredModifier
import androidx.compose.ui.unit.IntSize

private interface OnRemeasuredModifier {
    val OnRemeasuredModifier.ss: Any
        get() = this.onRemeasured(IntSize.Zero)
}