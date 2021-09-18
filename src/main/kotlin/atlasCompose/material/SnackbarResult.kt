package atlasCompose.material

import androidx.compose.material.Snackbar
import androidx.compose.material.SnackbarResult

private enum class SnackbarResult {
    /**
     * [Snackbar] that is shown has been dismissed either by timeout of by user
     */
    Dismissed,

    /**
     * Action on the [Snackbar] has been clicked before the time out passed
     */
    ActionPerformed,
}