package compose.material

import androidx.compose.material.SnackbarHostState
import kotlinx.coroutines.runBlocking

private class SnackbarHostState {
    init {
        SnackbarHostState().apply {
            this.currentSnackbarData
            runBlocking {
                this@apply.showSnackbar("")
            }
        }
    }
}