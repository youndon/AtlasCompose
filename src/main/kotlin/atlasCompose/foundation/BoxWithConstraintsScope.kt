package compose.foundation

import androidx.compose.foundation.layout.BoxWithConstraintsScope

private interface BoxWithConstraintsScope {
      val BoxWithConstraintsScope.ss:Any
      get() = this.apply {
          this.constraints
          this.maxHeight
          this.maxWidth
          this.minHeight
          this.minWidth
      }
}