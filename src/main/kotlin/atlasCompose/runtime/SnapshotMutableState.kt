package atlasCompose.runtime

import androidx.compose.runtime.snapshots.SnapshotMutableState

private interface SnapshotMutableState {
    val <T> SnapshotMutableState<T>.ss: Any
        get() = this.policy
}