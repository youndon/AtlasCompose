package atlasCompose.runtime

import androidx.compose.runtime.snapshots.SnapshotApplyResult

private class SnapshotApplyResult {
    val SnapshotApplyResult.ss: Any
        get() = this.apply {
            this.succeeded
            this.check()
        }
}