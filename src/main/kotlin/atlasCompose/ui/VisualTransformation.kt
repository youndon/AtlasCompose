package atlasCompose.ui

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.VisualTransformation

private interface VisualTransformation {
    val VisualTransformation.ss: Any
        get() = this.filter(AnnotatedString(""))
    companion object{
        init {
            VisualTransformation.Companion.None
        }
    }
}