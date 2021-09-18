package compose.foundation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.itemsIndexed

private interface LazyListScope {
        @OptIn(ExperimentalFoundationApi::class)
        val LazyListScope.ss:Any
        get() = this.apply {
            this.item {  }
//            this.items()
            this.stickyHeader {  }
//            this.itemsIndexed()
        }
}