package components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

interface `Image'` {
    @Composable
    fun image() {
        Image(
            painter = painterResource("Images/black-hole.jpg"),
            contentDescription = "black-hole",
            modifier = Modifier,
            alignment = Alignment.Center,
            contentScale = ContentScale.Fit,
            // Fit, Crop, Inside, None, FillBounds, FillHeight, FillWidth
            alpha = DefaultAlpha,
            colorFilter = null
        )
    }
}