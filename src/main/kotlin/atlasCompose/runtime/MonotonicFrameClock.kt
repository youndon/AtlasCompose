package atlasCompose.runtime

import androidx.compose.runtime.MonotonicFrameClock
import kotlinx.coroutines.runBlocking

private interface MonotonicFrameClock {
    val MonotonicFrameClock.ss: Any
        get() = runBlocking {
            this@ss.withFrameNanos { }
        }
}