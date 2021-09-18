package atlasCompose.ui

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.PointerId
import androidx.compose.ui.input.pointer.TestPointerInputEventData

@Deprecated("Don't have public members!!")
class TestPointerInputEventData {
    init {
        TestPointerInputEventData(PointerId(1),1, Offset.Zero,false)
    }
}