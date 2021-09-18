package compose.animation

import androidx.compose.animation.core.RepeatMode

private enum class RepeatMode {

    Restart, // [Restart] will restart the animation and animate from the start value to the end value.

    Reverse // [Reverse] will reverse the last iteration as the animation repeats.

}