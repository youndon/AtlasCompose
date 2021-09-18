package atlasCompose.ui

import androidx.compose.ui.graphics.VertexMode

private class VertexMode {
    init {
        VertexMode.apply {
            this.TriangleFan
            this.TriangleStrip
            this.Triangles
        }
    }
}