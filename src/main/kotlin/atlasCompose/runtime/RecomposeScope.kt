package atlasCompose.runtime

import androidx.compose.runtime.RecomposeScope

private interface RecomposeScope {
    val RecomposeScope.ss: Any
        get() = this.invalidate()
}