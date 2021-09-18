package atlasCompose.ui

import androidx.compose.ui.graphics.VertexMode
import androidx.compose.ui.graphics.Vertices

private class Vertices {
    init {
        Vertices(VertexMode.TriangleFan, listOf(), listOf(), listOf(), listOf()).apply {
            // parameter:
            this.vertexMode

            // block
            this.colors
            this.indices
            this.textureCoordinates
            this.positions
        }
    }
}