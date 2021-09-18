package atlasCompose.ui

import androidx.compose.ui.graphics.Outline

private class Outline {
    private fun Outline.ss(): Nothing = when (this) {
        is Outline.Generic -> TODO()
        is Outline.Rectangle -> TODO()
        is Outline.Rounded -> TODO()
    }

    val Outline.ss: Any
        get() = this.bounds
}