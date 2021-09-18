package atlasCompose.ui

import androidx.compose.ui.platform.DesktopRootForTest

private interface DesktopRootForTest {
    val DesktopRootForTest.ss: Any
        get() = this.processPointerInput(1, listOf())
}