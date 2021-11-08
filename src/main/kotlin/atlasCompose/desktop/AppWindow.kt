package compose.desktop

import androidx.compose.desktop.AppWindow

private class AppWindow {
    init {
        AppWindow().apply {
            this.show {  }
        }
    }
}