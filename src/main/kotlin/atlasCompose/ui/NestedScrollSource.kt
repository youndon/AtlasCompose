package atlasCompose.ui

import androidx.compose.ui.input.nestedscroll.NestedScrollSource

private class NestedScrollSource {
    init {
        NestedScrollSource.apply {
            this.Drag
            this.Fling
        }
    }
}