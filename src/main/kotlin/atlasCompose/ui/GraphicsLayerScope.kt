package atlasCompose.ui

import androidx.compose.ui.graphics.GraphicsLayerScope

private interface GraphicsLayerScope {
    val GraphicsLayerScope.ss: Any
        get() = this.apply {
            this.alpha
            this.cameraDistance
            this.clip
            this.rotationX
            this.rotationY
            this.rotationZ
            this.scaleX
            this.scaleY
            this.shadowElevation
            this.shape
            this.transformOrigin
            this.translationX
            this.translationY
        }
}