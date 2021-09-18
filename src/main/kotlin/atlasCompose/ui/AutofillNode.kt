package atlasCompose.ui

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.autofill.AutofillNode

private class AutofillNode {
    @OptIn(ExperimentalComposeUiApi::class)
    val AutofillNode.ss: Any get() = this.id
}