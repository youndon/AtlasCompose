package atlasCompose.ui

import androidx.compose.ui.graphics.drawscope.ContentDrawScope

private interface ContentDrawScope {
    val ContentDrawScope.ss: Any get() = drawContent()
}