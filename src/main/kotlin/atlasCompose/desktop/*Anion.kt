package atlasCompose.desktop

import androidx.compose.desktop.*
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
@Preview
private fun void() {
    LocalAppWindow
    NoOpUpdate
    Window { }
    DesktopMaterialTheme {  }
    DesktopTheme {  }
//    SwingPanel() // FIXME: 15/07/2021
}