package atlasCompose.ui

import androidx.compose.ui.platform.InspectableValue

private interface InspectableValue {
    val InspectableValue.ss: Any
        get() = this.apply {
            this.inspectableElements
            this.nameFallback
            this.valueOverride
        }
}