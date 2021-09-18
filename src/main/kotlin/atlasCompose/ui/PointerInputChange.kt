package atlasCompose.ui

import androidx.compose.ui.input.pointer.*
import androidx.compose.ui.input.pointer.PointerInputChange
import androidx.compose.ui.unit.IntSize

private class PointerInputChange {
    val PointerInputChange.ss: Any
        get() = this.apply {
            this.anyChangeConsumed()
            this.changedToDown()
            this.changedToUp()
            this.changedToDownIgnoreConsumed()
            this.changedToUpIgnoreConsumed()
            this.consumeAllChanges()
            this.consumeDownChange()
            this.consumePositionChange()
            this.isOutOfBounds(IntSize.Zero)
            this.positionChangeConsumed()
            this.positionChangeIgnoreConsumed()
            this.positionChanged()
            this.positionChangedIgnoreConsumed()
        }
}