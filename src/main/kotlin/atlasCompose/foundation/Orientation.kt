package compose.foundation

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.scrollable

private enum class Orientation {

    /**
     * Vertical orientation representing Y axis
     */
    Vertical,

    /**
     * Horizontal orientation representing X axis.
     *
     * Note: this value specifies just the axis, not the direction (left-to-right or
     * right-to-left). To support RTL cases, use `reverseDirection = true` on [scrollable] and
     * [draggable].
     */
    Horizontal
}