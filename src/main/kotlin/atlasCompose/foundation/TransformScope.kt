package compose.foundation

import androidx.compose.foundation.gestures.TransformScope

private interface TransformScope {
    val TransformScope.ss: Any
        get() = this.transformBy()
}