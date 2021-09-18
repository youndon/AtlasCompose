package atlasCompose.runtime

import androidx.compose.runtime.saveable.SaveableStateRegistry

private interface SaveableStateRegistry {
    val SaveableStateRegistry.ss: Any
        get() = this.apply {
//         this.canBeSaved()
//         this.consumeRestored()
            this.performSave()
//         this.registerProvider()
        }
}