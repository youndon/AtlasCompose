package compose.foundation

import androidx.compose.foundation.gestures.PressGestureScope

private interface PressGestureScope {
    val PressGestureScope.ss:Any
    get() = this.apply {
//        this.awaitRelease()
//        this.tryAwaitRelease()
    }
}
