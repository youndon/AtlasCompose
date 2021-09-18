package atlasCompose.runtime

import androidx.compose.runtime.collection.MutableVector

private class MutableVector {
      private val <T> MutableVector<T>.ss:Any
       get() = this.apply {
           /* Most mutableList exist here */
       }
}