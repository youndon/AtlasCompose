package atlasCompose.ui

import androidx.compose.ui.graphics.ImageBitmapConfig

private class ImageBitmapConfig {
    init {
        ImageBitmapConfig.apply {
            this.Alpha8
            this.Argb8888
            this.F16
            this.Gpu
            this.Rgb565
        }
    }
}