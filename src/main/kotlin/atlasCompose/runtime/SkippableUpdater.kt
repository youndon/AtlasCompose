package atlasCompose.runtime

import androidx.compose.runtime.SkippableUpdater

private class SkippableUpdater {
    val <T>      SkippableUpdater<T>.ss: Any
        get() = this.update { }
}