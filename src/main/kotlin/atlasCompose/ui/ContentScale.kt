package atlasCompose.ui

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.ContentScale

private interface ContentScale {
    val ContentScale.ss: Any get() = computeScaleFactor(Size.Zero, Size.Zero)

    companion object {
        init {
            ContentScale.apply {
                this.Crop
                this.FillBounds
                this.FillHeight
                this.FillWidth
                this.Fit
                this.Inside
                this.None
            }
        }
    }
}