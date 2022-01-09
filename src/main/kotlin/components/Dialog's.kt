package components
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.ComposeDialog
import androidx.compose.ui.window.Dialog

interface `Dialog's` {
    @OptIn(ExperimentalMaterialApi::class)
    @Composable
    fun dialog() {
        Column {
            Dialog(
                visible = true,
                onPreviewKeyEvent = { false },
                onKeyEvent = { false },
                create = { ComposeDialog() },
                dispose = {
                },
                update = {
                },
            ) {
            }

            AlertDialog(
                onDismissRequest = {   },
                buttons = @Composable {   },
                modifier = Modifier,
                title = @Composable {   },
                text = @Composable {   },
                shape = MaterialTheme.shapes.medium,
                backgroundColor = MaterialTheme.colors.surface,
                contentColor = contentColorFor(backgroundColor),
                dialogProvider = PopupAlertDialogProvider
            )
        }
    }
}