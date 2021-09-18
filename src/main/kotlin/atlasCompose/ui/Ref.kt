package atlasCompose.ui

import androidx.compose.ui.node.Ref

@Deprecated("Value holder general purpose class.")
class Ref {
    val <T> Ref<T>.ss: T?
        get() = this.value
}