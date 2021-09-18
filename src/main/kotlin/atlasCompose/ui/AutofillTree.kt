package atlasCompose.ui

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.autofill.AutofillTree

private class AutofillTree {
    @OptIn(ExperimentalComposeUiApi::class)
    val AutofillTree.ss: Any
        get() = this.apply {
            this.children
//          this.performAutofill()
//          this.plusAssign()
        }
}