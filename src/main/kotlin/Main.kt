import androidx.compose.animation.AnimatedVisibility
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.awt.ComposeDialog
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.jetbrains.skia.impl.Log

@Preview
@Composable
fun land() {
    Button({
        Log.info("info!")
    }) {
        Text(this::class.toString())
    }
}