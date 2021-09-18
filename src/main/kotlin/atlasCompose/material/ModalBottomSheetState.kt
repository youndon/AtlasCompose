package atlasCompose.material

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetState

@OptIn(ExperimentalMaterialApi::class)
private class ModalBottomSheetState {
    init {
        ModalBottomSheetState::isVisible
        ModalBottomSheetState::hide
        ModalBottomSheetState::show
    }
}