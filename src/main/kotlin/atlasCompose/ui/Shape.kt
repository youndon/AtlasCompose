package atlasCompose.ui

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

private interface Shape {
    val Shape.ss: Any
        get() = createOutline(Size.Zero, LayoutDirection.Ltr, Density(1f))
}