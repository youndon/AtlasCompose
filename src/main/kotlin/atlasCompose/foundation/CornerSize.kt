package compose.foundation

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.Density

private interface CornerSize {
    val CornerSize.ss:Any
    get() = this.toPx(Size.Zero, Density(1f))
}