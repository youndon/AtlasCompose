package compose.foundation

import androidx.compose.foundation.gestures.ScrollScope

private interface ScrollScope {
    val ScrollScope.ss: Any
        get() = this.scrollBy(1f)
}