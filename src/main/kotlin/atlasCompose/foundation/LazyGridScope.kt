package compose.foundation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.LazyGridScope

private interface LazyGridScope {
       @OptIn(ExperimentalFoundationApi::class)
       val LazyGridScope.ss:Any
       get() = this.apply {
           this.item {  }
//           this.items()
//           this.itemsIndexed()
       }
}