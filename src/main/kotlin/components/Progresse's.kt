package components

import androidx.compose.material.*
import androidx.compose.material.ProgressIndicatorDefaults.IndicatorBackgroundOpacity
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

interface `Progresse's` {

    @OptIn(ExperimentalMaterialApi::class)
    @Composable
    fun progresses() {
        CircularProgressIndicator(
            modifier = Modifier,
            color = MaterialTheme.colors.primary,
            strokeWidth = ProgressIndicatorDefaults.StrokeWidth
        )
        LinearProgressIndicator(
            modifier = Modifier,
            color = MaterialTheme.colors.primary,
            backgroundColor = MaterialTheme.colors.primary.copy(alpha = IndicatorBackgroundOpacity)
        )
    }
}