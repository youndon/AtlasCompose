package atlasCompose.ui

import androidx.compose.ui.focus.FocusOrder
import androidx.compose.ui.focus.FocusOrderModifier

private interface FocusOrderModifier {
    val FocusOrderModifier.ss: Any
        get() = this.populateFocusOrder(FocusOrder())
}