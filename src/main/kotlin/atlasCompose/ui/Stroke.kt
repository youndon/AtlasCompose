package atlasCompose.ui

import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke

private class Stroke {
    val  Stroke.ss:Any
    get() = this.apply {
        // parameters:
            /**
             * Configure the width of the stroke in pixels
             */
            this.width
            /**
             * Set the stroke miter value. This is used to control the behavior of miter
             * joins when the joins angle is sharp. This value must be >= 0.
             */
            this.miter
            /**
             * Return the paint's Cap, controlling how the start and end of stroked
             * lines and paths are treated. The default is [StrokeCap.Butt]
             */
            this.cap
            /**
             * Set's the treatment where lines and curve segments join on a stroked path.
             * The default is [StrokeJoin.Miter]
             */
            this.join
            /**
             * Effect to apply to the stroke, null indicates a solid stroke line is to be drawn
             */
            this.pathEffect
        }
    init {
        Stroke.Companion.apply {
            this.DefaultCap
            this.DefaultJoin
            this.DefaultMiter
            this.HairlineWidth
        }
    }
}