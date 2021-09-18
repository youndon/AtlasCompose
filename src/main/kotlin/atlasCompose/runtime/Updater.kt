package atlasCompose.runtime

import androidx.compose.runtime.Updater

private class Updater {
    val <T> Updater<T>.ss: Any
        get() = this.apply {
            this.init { }
            this.reconcile { }
//       this.set()
//       this.update()
        }
}