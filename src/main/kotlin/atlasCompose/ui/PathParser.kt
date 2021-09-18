package atlasCompose.ui

import androidx.compose.ui.graphics.vector.PathParser

private class PathParser {
    init {
        PathParser().apply {
            this.addPathNodes(listOf())
            this.clear()
            this.parsePathString("")
            this.toNodes()
            this.toPath()
        }
    }
}