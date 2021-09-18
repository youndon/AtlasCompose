package atlasCompose.ui

import androidx.compose.ui.graphics.PathMeasure

private interface PathMeasure {
    val PathMeasure.ss: Any
        get() = this.apply {
            this.length
//            this.getSegment()
//            this.setPath()
        }
}