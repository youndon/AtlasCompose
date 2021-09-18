package compose.foundation

import androidx.compose.foundation.gestures.DragScope

private interface DragScope {
     val DragScope.ss:Any
     get() = this.dragBy(1f)
}