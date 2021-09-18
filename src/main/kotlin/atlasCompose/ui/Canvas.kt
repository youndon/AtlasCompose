package atlasCompose.ui

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.Canvas

private interface Canvas {
        val Canvas.ss:Any
        get() = this.apply {
//            this.clipPath()
//            this.clipRect()
//            this.concat()
            this.disableZ()
//            this.drawArc()
//            this.drawArcRad()
//            this.drawCircle()
//            this.drawImage()
//            this.drawImageRect()
//            this.drawLine()
//            this.drawOval()
//            this.drawPath()
//            this.drawPoints()
//            this.drawRawPoints()
//            this.drawRect()
//            this.drawRoundRect()
//            this.drawVertices()
            this.enableZ()
            this.restore()
//            this.rotate()
            this.save()
//            this.saveLayer()
//            this.scale()
//            this.skew()
//            this.skewRad()
//            this.translate()
            this.nativeCanvas
//            this.drawOutline()
//            this.rotate()
//            this.rotateRad()
            this.withSave {  }
//            this.withSaveLayer()
        }

}