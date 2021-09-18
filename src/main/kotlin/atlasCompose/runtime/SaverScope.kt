package atlasCompose.runtime

import androidx.compose.runtime.saveable.SaverScope

private interface SaverScope {
    val SaverScope.ss: Any
        get() = this.canBeSaved(1)
}