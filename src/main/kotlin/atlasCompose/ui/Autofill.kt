package atlasCompose.ui

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.autofill.Autofill
import androidx.compose.ui.autofill.AutofillNode

private interface Autofill {
    @OptIn(ExperimentalComposeUiApi::class)
    val Autofill.ss:Any
    get() = this.apply {
//        this.cancelAutofillForNode()
//        this.requestAutofillForNode()
    }
}