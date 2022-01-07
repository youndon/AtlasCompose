package atlasCompose.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.relocation.BringIntoViewRequester
import androidx.compose.ui.ExperimentalComposeUiApi
import kotlinx.coroutines.runBlocking

@OptIn(ExperimentalComposeUiApi::class, ExperimentalFoundationApi::class)
private class RelocationRequester {
    init {
        runBlocking {
            BringIntoViewRequester().bringIntoView()
        }
    }
}