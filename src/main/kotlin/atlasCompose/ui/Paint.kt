package atlasCompose.ui

import androidx.compose.ui.graphics.Paint

private interface Paint {
    val Paint.ss: Any
        get() = this.apply {
            this.alpha
            this.blendMode
            this.color
            this.colorFilter
            this.filterQuality
            this.isAntiAlias
            this.pathEffect
            this.shader
            this.strokeCap
            this.strokeJoin
            this.strokeMiterLimit
            this.strokeWidth
            this.style
            this.asFrameworkPaint()
        }
}