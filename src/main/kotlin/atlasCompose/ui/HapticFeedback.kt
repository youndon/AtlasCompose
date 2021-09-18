package atlasCompose.ui

import androidx.compose.ui.hapticfeedback.HapticFeedback
import androidx.compose.ui.hapticfeedback.HapticFeedbackType

private interface HapticFeedback {
    val HapticFeedback.ss: Any
        get() = performHapticFeedback(HapticFeedbackType.LongPress)
}
