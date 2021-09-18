package compose.foundation

import androidx.compose.foundation.lazy.LazyListLayoutInfo

private interface LazyListLayoutInfo {
    val LazyListLayoutInfo.ss: Any
        get() = this.apply {
            this.totalItemsCount
            this.viewportEndOffset
            this.viewportStartOffset
            this.visibleItemsInfo
        }
}