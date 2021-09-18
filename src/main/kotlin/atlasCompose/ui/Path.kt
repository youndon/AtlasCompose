package atlasCompose.ui

import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.graphics.addOutline
import androidx.compose.ui.graphics.asDesktopPath


private interface Path {
    companion object{
        init {
            Path.Companion.combine(PathOperation.Difference, Path(), Path())
        }
    }

    val Path.ss: Any
        get() = this.apply {
            this.fillType
            this.isConvex
            this.isEmpty
//        this.addArc()
//        this.addArcRad()
//        this.addOval()
//        this.addPath()
//        this.addRect()
//        this.addRoundRect()
//        this.arcTo()
//        this.arcToRad()
            this.close()
//        this.cubicTo()
            this.getBounds()
//        this.lineTo()
//        this.op()
//        this.relativeLineTo()
//        this.moveTo()
//        this.relativeCubicTo()
            this.reset()
//        this.quadraticBezierTo()
//        this.relativeMoveTo()
//        this.translate()
//        this.relativeQuadraticBezierTo()
//        this.addOutline()
            this.asDesktopPath()
        }
}