package atlasCompose.desktop

import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.DesktopTheme
import androidx.compose.desktop.LocalAppWindow
import androidx.compose.desktop.Window
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable

@Composable
@Preview
private fun void() {
    LocalAppWindow
    Window { }
    DesktopMaterialTheme {  }
    DesktopTheme {  }
//    SwingPanel() // FIXME: 15/07/2021
}