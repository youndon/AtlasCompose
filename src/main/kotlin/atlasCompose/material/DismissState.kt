package atlasCompose.material

import androidx.compose.material.DismissState
import androidx.compose.material.ExperimentalMaterialApi

@OptIn(ExperimentalMaterialApi::class)
private class DismissState {
    init {
        DismissState::dismissDirection
        DismissState::dismiss
        DismissState::isDismissed
        DismissState::reset
    }
}