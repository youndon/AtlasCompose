package atlasCompose.ui

import androidx.compose.foundation.gestures.*
import androidx.compose.ui.input.pointer.PointerInputScope
import kotlinx.coroutines.runBlocking

private interface PointerInputScope {
    val PointerInputScope.ss: Any
        get() = this.apply {
            this.size
            this.viewConfiguration
            runBlocking {
                this@apply.awaitPointerEventScope { }
                this@apply.detectDragGestures { change, dragAmount -> }
                this@apply.detectDragGesturesAfterLongPress { change, dragAmount -> }
                this@apply.detectHorizontalDragGestures { change, dragAmount -> }
                this@apply.detectTapGestures { }
                this@apply.detectTransformGestures { centroid, pan, zoom, rotation -> }
                this@apply.detectVerticalDragGestures { change, dragAmount -> }
                this@apply.forEachGesture { }
            }
        }
}