package compose.desktop

import androidx.compose.desktop.AppFrame

private class AppFrame {
    private val AppFrame.ss: Any
        get() = this.apply {
            this.events
            this.height
            this.icon
            this.invoker
            this.isClosed
            this.isFullscreen
            this.isMaximized
            this.isMinimized
            this.resizable
            this.title
            this.width
            this.window
            this.x
            this.y
            this.close()
//            this.addMouseListener()
//            this.addMouseMotionListener()
            this.makeFullscreen()
            this.maximize()
            this.minimize()
            this.removeMenuBar()
//            this.removeMouseListener()
//            this.removeMouseMotionListener()
            this.restore()
//            this.setIcon()
//            this.setLocation()
//            this.setMenuBar()
//            this.setSize()
//            this.setTitle()
            this.setWindowCentered()
        }

}