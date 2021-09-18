package atlasCompose.runtime

import androidx.compose.runtime.DisposableEffectScope

private class DisposableEffectScope {
    init {
        DisposableEffectScope().onDispose {  }
    }
}