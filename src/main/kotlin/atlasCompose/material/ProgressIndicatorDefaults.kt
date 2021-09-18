package atlasCompose.material

import androidx.compose.material.ProgressIndicatorDefaults

private object ProgressIndicatorDefaults {
    init {
        ProgressIndicatorDefaults.apply {
            this.IndicatorBackgroundOpacity
            this.ProgressAnimationSpec
            this.StrokeWidth
        }
    }
}