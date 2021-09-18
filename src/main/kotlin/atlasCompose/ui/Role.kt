package atlasCompose.ui

import androidx.compose.ui.semantics.Role

private class Role {
    init {
        Role.apply {
            this.Button
            this.Checkbox
            this.Image
            this.RadioButton
            this.Switch
            this.Tab
        }
    }
}