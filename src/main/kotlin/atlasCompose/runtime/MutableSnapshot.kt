package atlasCompose.runtime

import androidx.compose.runtime.snapshots.MutableSnapshot

private class MutableSnapshot {
   private val MutableSnapshot.ss: Any
        get() = this.apply {
            this.apply()
            this.takeNestedMutableSnapshot { }
        }
}