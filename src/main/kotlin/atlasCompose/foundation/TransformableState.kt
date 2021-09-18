package compose.foundation

import androidx.compose.foundation.gestures.*
import androidx.compose.foundation.gestures.TransformableState

private interface TransformableState {
        val TransformableState.ss:Any
        get() = this.apply {
            this.isTransformInProgress
//            this.transform {  }
//            this.animatePanBy()
//            this.animateRotateBy()
//            this.animateZoomBy()
//            this.panBy()
//            this.rotateBy()
//            this.stopTransformation()
//            this.zoomBy()
        }
}