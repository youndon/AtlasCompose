package atlasCompose.ui

import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.drawscope.inset

private interface DrawScope {
    val DrawScope.ss: Any
        get() = this.apply {
            this.center
            this.drawContext
            this.layoutDirection
            this.size
//            this.drawArc()
//            this.drawCircle()
//            this.drawImage()
//            this.drawLine()
//            this.drawOval()
//            this.drawPath()
//            this.drawPoints()
//            this.drawRect()
//            this.drawRoundRect()
//            this.clipPath()
            this.clipRect { }
            this.drawIntoCanvas { }
            this.inset { }
//            this.drawOutline()
        }
}