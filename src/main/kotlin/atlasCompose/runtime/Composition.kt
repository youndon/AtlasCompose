package atlasCompose.runtime

import androidx.compose.runtime.Composition

private interface Composition {
    val Composition.ss: Any
        get() = this.apply {
            this.hasInvalidations
            this.isDisposed
            this.dispose()
            this.setContent { }
        }

}