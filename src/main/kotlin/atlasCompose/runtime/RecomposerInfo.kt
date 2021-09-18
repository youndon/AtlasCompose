package atlasCompose.runtime

import androidx.compose.runtime.RecomposerInfo

private interface RecomposerInfo {
    val RecomposerInfo.ss: Any
        get() = this.apply {
            this.changeCount
            this.hasPendingWork
            this.state
        }
}