package atlasCompose.ui

import androidx.compose.ui.hapticfeedback.HapticFeedbackType

private enum class HapticFeedbackType {
    /**
     * The user has performed a long press on an object that is resulting
     * in an action being performed.
     */
    LongPress,
    /**
     * The user has performed a selection/insertion handle move on text field.
     */
    TextHandleMove
}