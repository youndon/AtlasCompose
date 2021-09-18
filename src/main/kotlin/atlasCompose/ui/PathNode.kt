package atlasCompose.ui

import androidx.compose.ui.graphics.vector.PathNode

private class PathNode {
    private fun PathNode.ss(): Nothing = when(this){
        PathNode.Close -> TODO()
        is PathNode.RelativeMoveTo -> TODO()
        is PathNode.MoveTo -> TODO()
        is PathNode.RelativeLineTo -> TODO()
        is PathNode.LineTo -> TODO()
        is PathNode.RelativeHorizontalTo -> TODO()
        is PathNode.HorizontalTo -> TODO()
        is PathNode.RelativeVerticalTo -> TODO()
        is PathNode.VerticalTo -> TODO()
        is PathNode.RelativeCurveTo -> TODO()
        is PathNode.CurveTo -> TODO()
        is PathNode.RelativeReflectiveCurveTo -> TODO()
        is PathNode.ReflectiveCurveTo -> TODO()
        is PathNode.RelativeQuadTo -> TODO()
        is PathNode.QuadTo -> TODO()
        is PathNode.RelativeReflectiveQuadTo -> TODO()
        is PathNode.ReflectiveQuadTo -> TODO()
        is PathNode.RelativeArcTo -> TODO()
        is PathNode.ArcTo -> TODO()
    }
}