package atlasCompose.ui

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.layout.RelocationRequester
import kotlinx.coroutines.runBlocking

@OptIn(ExperimentalComposeUiApi::class)
private class RelocationRequester {
    init {
        runBlocking {
            RelocationRequester().bringIntoView()
        }
    }
}