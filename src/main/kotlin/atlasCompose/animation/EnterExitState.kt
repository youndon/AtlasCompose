package compose.animation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterExitState

private enum class EnterExitState {

    PreEnter,  // The initial state of a custom enter animation in [AnimatedVisibility]..

    Visible,  // The `Visible` state is the target state of a custom *enter* animation, also the initial
              //  state of a custom *exit* animation in [AnimatedVisibility].

    PostExit // Target state of a custom *exit* animation in [AnimatedVisibility].

}