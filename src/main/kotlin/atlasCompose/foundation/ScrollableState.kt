package compose.foundation

import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.gestures.stopScroll

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