package atlasCompose.runtime

import androidx.compose.runtime.InternalComposeApi
import androidx.compose.runtime.snapshots.Snapshot

@OptIn(InternalComposeApi::class)
private class Snapshot {
    init {
        Snapshot.apply {
            this.current
            this.global {  }
            this.notifyObjectsInitialized()
            this.openSnapshotCount()
            this.registerApplyObserver{ set: Set<Any>, snapshot: Snapshot ->  }
            this.registerGlobalWriteObserver {  }
            this.sendApplyNotifications()
            this.takeMutableSnapshot {  }
            this.takeSnapshot()
            this.observe {  }
            this.withMutableSnapshot {  }
        }
    }
}