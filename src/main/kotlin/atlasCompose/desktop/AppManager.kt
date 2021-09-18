package compose.desktop

import androidx.compose.desktop.AppManager

private object AppManager {
    init {
        AppManager.apply {
            this.defaultActionOnWindowsEmpty
            this.focusedWindow
            this.windows
            this.exit()
            this.setEvents {  }
//            this.setMenu()
        }
    }
}