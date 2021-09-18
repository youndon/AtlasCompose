package atlasCompose.ui

import androidx.compose.ui.input.pointer.PointerEvent
import androidx.compose.ui.input.pointer.PointerInputFilter

private abstract class PointerInputFilter {
    val PointerInputFilter.ss: Any
        get() = this.apply {
            this.size
            this.onCancel()
//            this.onPointerEvent()
        }
}