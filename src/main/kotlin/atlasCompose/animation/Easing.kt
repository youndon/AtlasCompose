package compose.animation

import androidx.compose.animation.core.Easing

private interface Easing {
   val Easing.ss : Float
   get() = this.transform(1f)
}