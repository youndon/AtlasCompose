package atlasCompose.material

import androidx.compose.material.ResistanceConfig

private class ResistanceConfig {
    init {
        ResistanceConfig(1f).apply {
            this.computeResistance(1f)
        }
    }
}