package compose.foundation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.LazyGridScope
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed

private interface LazyGridScope {
       @OptIn(ExperimentalFoundationApi::class)
       val LazyGridScope.ss:Any
       get() = this.apply {
           this.item {  }
//           this.items()
//           this.itemsIndexed()
       }
}