package compose.foundation

import androidx.compose.foundation.gestures.DraggableState

private interface DraggableState {
    val DraggableState.ss:Any
    get() = this.apply {
//        this.dispatchRawDelta()
//        this.drag {  }
    }
}