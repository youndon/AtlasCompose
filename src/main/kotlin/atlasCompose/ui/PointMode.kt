package atlasCompose.ui

import androidx.compose.ui.graphics.PointMode

private class PointMode {
    init {
        PointMode.apply {
            this.Lines
            this.Points
            this.Polygon
        }
    }
}