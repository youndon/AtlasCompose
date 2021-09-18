package atlasCompose.runtime

import androidx.compose.runtime.ScopeUpdateScope

private interface ScopeUpdateScope {
    val ScopeUpdateScope.ss: Any
        get() = this.updateScope { composer, i -> i }
}