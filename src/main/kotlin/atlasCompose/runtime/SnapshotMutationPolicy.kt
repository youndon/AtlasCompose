package atlasCompose.runtime

import androidx.compose.runtime.SnapshotMutationPolicy

private interface SnapshotMutationPolicy {
    val <T> SnapshotMutationPolicy<T>.ss: Any
        get() = this.apply {
//            this.equivalent()
//            this.merge()
        }
}