package atlasCompose.material

import androidx.compose.material.DrawerState

private class DrawerState {
    init {
        DrawerState::currentValue
        DrawerState::isAnimationRunning
        DrawerState::isClosed
        DrawerState::isOpen
//        DrawerState::offset
//        DrawerState::targetValue
//        DrawerState::animateTo
        DrawerState::close
        DrawerState::open
//        DrawerState::snapTo
    }
}