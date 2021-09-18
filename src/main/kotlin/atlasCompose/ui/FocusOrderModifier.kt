package atlasCompose.ui

import androidx.compose.ui.focus.FocusOrder
import androidx.compose.ui.focus.FocusOrderModifier
import javax.swing.FocusManager

private interface FocusOrderModifier {
    val FocusOrderModifier.ss: Any
        get() = this.populateFocusOrder(FocusOrder())
}