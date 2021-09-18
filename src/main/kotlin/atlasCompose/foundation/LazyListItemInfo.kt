package compose.foundation

import androidx.compose.foundation.lazy.LazyListItemInfo

private interface LazyListItemInfo {
    val LazyListItemInfo.ss: Any
        get() = this.apply {
            this.index
            this.key
            this.offset
            this.size
        }
}