package atlasCompose.ui

import androidx.compose.ui.semantics.LiveRegionMode

private class LiveRegionMode {
    init {
        LiveRegionMode.apply {
            this.Assertive
            this.Polite
        }
    }
}