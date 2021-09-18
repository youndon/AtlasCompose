package atlasCompose.ui

import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.node.RootForTest

private interface RootForTest {
    val RootForTest.ss: Any
        get() = this.apply {
            this.density
            this.semanticsOwner
            this.textInputService
//            this.sendKeyEvent()
        }
}
