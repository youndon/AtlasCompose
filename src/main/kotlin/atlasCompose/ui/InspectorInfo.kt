package atlasCompose.ui

import androidx.compose.ui.platform.InspectorInfo

private class InspectorInfo {
    init {
        InspectorInfo().apply {
            this.name
            this.properties
            this.value
        }
    }
}