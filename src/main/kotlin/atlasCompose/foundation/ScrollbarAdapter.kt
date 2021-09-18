package compose.foundation

import androidx.compose.foundation.ScrollbarAdapter

private interface ScrollbarAdapter {
        val ScrollbarAdapter.ss:Any
        get() = this.apply {
            this.scrollOffset
//            this.maxScrollOffset()
//            this.scrollTo()
        }
}