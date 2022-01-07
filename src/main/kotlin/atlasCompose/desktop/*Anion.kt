package atlasCompose.desktop

import androidx.compose.foundation.LocalScrollbarStyle
import androidx.compose.foundation.ScrollbarStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window

@Composable
private fun void() {
    Window({}) { }
    MaterialTheme { }
    CompositionLocalProvider(
        LocalScrollbarStyle provides ScrollbarStyle(
            minimalHeight = 16.dp,
            thickness = 8.dp,
            shape = MaterialTheme.shapes.small,
            hoverDurationMillis = 300,
            unhoverColor = MaterialTheme.colors.onSurface.copy(alpha = 0.12f),
            hoverColor = MaterialTheme.colors.onSurface.copy(alpha = 0.50f)
        )
    ) {}
//    SwingPanel() // FIXME: 15/07/2021
}