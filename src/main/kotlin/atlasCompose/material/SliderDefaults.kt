package atlasCompose.material

import androidx.compose.material.SliderDefaults

private object SliderDefaults {
    init {
        SliderDefaults.apply {
            this.DisabledActiveTrackAlpha
            this.DisabledInactiveTrackAlpha
            this.DisabledTickAlpha
            this.InactiveTrackAlpha
            this.TickAlpha
//            this.colors()
        }
    }
}