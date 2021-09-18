package atlasCompose.ui

import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.DesktopCanvas
import org.jetbrains.skija.Canvas

private class DesktopCanvas {
    init {
        DesktopCanvas(Canvas(1,true,""))
            .clipRoundRect(RoundRect.Zero)
    }
}