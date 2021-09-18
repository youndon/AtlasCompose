package atlasCompose.material

import androidx.compose.material.Colors
import androidx.compose.material.contentColorFor
import androidx.compose.material.primarySurface
import androidx.compose.ui.graphics.Color

private class Colors {
      private val Colors.ss:Any
           // those parameters:
       get() = this.apply {
           this.background
           this.error
           this.isLight
           this.onBackground
           this.onError
           this.onPrimary
           this.onSecondary
           this.onSurface
           this.primary
           this.primaryVariant
           this.secondary
           this.secondaryVariant
           this.surface
       }
    init {
        Colors::primarySurface
        Colors::contentColorFor
    }
}