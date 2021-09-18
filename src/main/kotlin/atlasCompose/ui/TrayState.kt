package atlasCompose.ui

import androidx.compose.ui.window.Notification
import androidx.compose.ui.window.TrayState

private class TrayState {
    init {
        TrayState().apply {
            notificationFlow
            sendNotification(Notification("","",Notification.Type.Info))
        }
    }
}