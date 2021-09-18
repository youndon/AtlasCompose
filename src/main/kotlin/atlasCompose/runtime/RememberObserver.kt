package atlasCompose.runtime

import androidx.compose.runtime.RememberObserver

private interface RememberObserver {
    val RememberObserver.ss: Any
        get() = this.apply {
            this.onAbandoned()
            this.onForgotten()
            this.onRemembered()
        }
}