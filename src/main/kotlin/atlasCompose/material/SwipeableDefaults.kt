package atlasCompose.material

import androidx.compose.material.SwipeableDefaults

private object SwipeableDefaults {
    init {
        SwipeableDefaults.apply {
            this.AnimationSpec
            this.StandardResistanceFactor
            this.StiffResistanceFactor
            this.VelocityThreshold
            this.resistanceConfig(setOf())
        }
    }
}