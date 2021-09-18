package atlasCompose.ui

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.pointer.util.VelocityTracker

private class VelocityTracker {
    init {
        VelocityTracker().apply {
            this.addPosition(1, Offset.Zero)
            this.calculateVelocity()
            this.resetTracking()
        }
    }
}