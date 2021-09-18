package atlasCompose.runtime

import androidx.compose.runtime.snapshots.SnapshotStateList

private class SnapshotStateList {
    val <T> SnapshotStateList<T>.ss: Any
        get() = this.removeRange(1, 1)
}