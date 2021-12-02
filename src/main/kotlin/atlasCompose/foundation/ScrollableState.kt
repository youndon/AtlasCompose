package compose.foundation

import androidx.compose.foundation.gestures.ScrollableState

private interface ScrollableState {
     val ScrollableState.ss:Any
     get() = this.apply {
         this.isScrollInProgress
//         this.dispatchRawDelta()
//         this.scroll {  }
//         this.animateScrollBy()
//         this.scrollBy()
//         this.stopScroll()
     }
}