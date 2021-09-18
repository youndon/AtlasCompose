package atlasCompose.runtime

import androidx.compose.runtime.saveable.SaveableStateHolder

private interface SaveableStateHolder {
    val SaveableStateHolder.ss: Any
        get() = this.apply {
//            this.SaveableStateProvider()
//            this.removeState()
        }
}