package atlasCompose.ui

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.layout.GraphicLayerInfo

private interface GraphicLayerInfo {
        @OptIn(ExperimentalComposeUiApi::class)
        val GraphicLayerInfo.ss:Any
        get() = this.apply {
            this.layerId
            this.ownerViewId
        }
}