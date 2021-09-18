package atlasCompose.runtime

import androidx.compose.runtime.ProvidableCompositionLocal

private abstract class ProvidableCompositionLocal {
    val <T> ProvidableCompositionLocal<T>.ss: Any
        get() = this.apply {
//            this.provides()
//            this.providesDefault()
        }
}