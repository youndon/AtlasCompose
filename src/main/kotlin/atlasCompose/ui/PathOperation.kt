package atlasCompose.ui

import androidx.compose.ui.graphics.PathOperation

private class PathOperation {
    init {
        PathOperation.apply {
            this.Difference
            this.Intersect
            this.ReverseDifference
            this.Union
            this.Xor
        }
    }
}