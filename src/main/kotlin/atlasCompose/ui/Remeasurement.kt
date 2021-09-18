package atlasCompose.ui

import androidx.compose.ui.layout.Remeasurement

private interface Remeasurement {
    val Remeasurement.ss: Any
        get() = this.forceRemeasure()
}