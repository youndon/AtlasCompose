package atlasCompose.runtime

import androidx.compose.runtime.MutableState

private interface MutableState {
        val <T> MutableState<T>.ss:Any
        get() = this.apply {
            this.component1()
            this.component2()
        }
}