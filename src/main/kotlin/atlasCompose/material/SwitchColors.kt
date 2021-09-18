package atlasCompose.material

import androidx.compose.material.SwitchColors

private interface SwitchColors {
    val SwitchColors.ss: Any
        get() = this.apply {
//            this.thumbColor()
//            this.trackColor()
        }
}