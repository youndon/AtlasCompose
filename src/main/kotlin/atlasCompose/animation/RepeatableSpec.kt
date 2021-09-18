package compose.animation

import androidx.compose.animation.core.RepeatableSpec

private class RepeatableSpec {
      private val <T> RepeatableSpec<T>.ss:Any
      get() = this.apply {
          this.animation
          this.iterations
          this.repeatMode
      }
}