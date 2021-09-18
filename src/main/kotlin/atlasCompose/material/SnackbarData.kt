package atlasCompose.material

import androidx.compose.material.SnackbarData

private interface SnackbarData {
    val SnackbarData.ss: Any
        get() = this.apply {
            this.actionLabel
            this.duration
            this.message
            this.dismiss()
            this.performAction()
        }
}