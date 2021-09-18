package atlasCompose.ui

import androidx.compose.ui.layout.SubcomposeLayoutState

private class SubcomposeLayoutState {
    init {
        SubcomposeLayoutState().precompose("") {}
    }
}