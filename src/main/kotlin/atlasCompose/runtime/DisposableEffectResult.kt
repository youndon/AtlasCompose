package atlasCompose.runtime

import androidx.compose.runtime.DisposableEffectResult

private interface DisposableEffectResult {
    val DisposableEffectResult.ss: Any
        get() = this.dispose()
}