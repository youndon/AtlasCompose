package atlasCompose.ui

import androidx.compose.ui.input.pointer.PointerInputModifier

private interface PointerInputModifier {
    val PointerInputModifier.ss: Any
        get() = this.pointerInputFilter
}