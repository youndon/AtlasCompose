package atlasCompose.ui

import androidx.compose.ui.input.mouse.MouseScrollEvent
import androidx.compose.ui.platform.TestComposeWindow

private class TestComposeWindow {
    init {
        TestComposeWindow(1,1).apply {
            // parameters:
            this.density
            this.height
            this.width

            // block:
            this.roots
            this.surface
            this.dispose()
            this.hasInvalidations()
            this.onMouseEntered(1,1)
            this.onMouseExited()
            this.onMouseMoved(1,1)
//            this.onMouseScroll()
            this.setContent {  }
        }
    }
}