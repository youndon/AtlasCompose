package atlasCompose.ui

import androidx.compose.ui.platform.AccessibilityManager

private interface AccessibilityManager {
    val AccessibilityManager.ss: Any
        get() = this.calculateRecommendedTimeoutMillis(1)
}