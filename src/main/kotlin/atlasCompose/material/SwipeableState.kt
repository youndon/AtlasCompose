package atlasCompose.material

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.SwipeableState

@OptIn(ExperimentalMaterialApi::class)
private class SwipeableState {
     private val <T> SwipeableState<T>.ss:Any
          get() = this.apply {
              this.currentValue
              this.direction
              this.isAnimationRunning
              this.offset
              this.overflow
              this.progress
              this.targetValue
//              this.animateTo()
//              this.performDrag()
//              this.performFling()
//              this.snapTo()
          }


}