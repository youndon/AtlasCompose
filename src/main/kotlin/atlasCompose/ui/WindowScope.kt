package atlasCompose.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.MenuBar
import androidx.compose.ui.window.WindowScope

private interface WindowScope {
    @Composable
     fun WindowScope.ss() {
          this.apply {
             this.window
             this.MenuBar { }
         }
     }
}