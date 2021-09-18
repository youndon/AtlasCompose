package atlasCompose.ui

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.ShaderBrush

private abstract class ShaderBrush {
    val ShaderBrush.ss: Any
        get() = this.createShader(Size.Zero)
}