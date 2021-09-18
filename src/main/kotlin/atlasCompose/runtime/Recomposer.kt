package atlasCompose.runtime

import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.runtime.Recomposer

private class Recomposer {
        @OptIn(ExperimentalComposeApi::class)
        val Recomposer.ss:Any
        get() = this.apply {
            this.changeCount
            this.hasPendingWork
            this.state
            this.asRecomposerInfo()
//            this.awaitIdle()
            this.cancel()
            this.close()
//            this.join()
//            this.runRecomposeAndApplyChanges()
//            this.runRecomposeConcurrentlyAndApplyChanges()
        }
}