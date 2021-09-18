package atlasCompose.runtime

import androidx.compose.runtime.BroadcastFrameClock

private class BroadcastFrameClock {
    init {
        BroadcastFrameClock {}.apply {
            this.hasAwaiters
            this.cancel()
//            this.sendFrame()
        }
    }
}