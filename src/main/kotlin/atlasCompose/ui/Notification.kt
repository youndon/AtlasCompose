package atlasCompose.ui

import androidx.compose.ui.window.Notification

private class Notification {
    init {
        Notification("","",Notification.Type.Info)
    }
       private enum class Type {
            /**
             * Simple notification
             */
            None,

            /**
             * Info notification
             */
            Info,

            /**
             * Warning notification
             */
            Warning,

            /**
             * Error notification
             */
            Error,
        }

}