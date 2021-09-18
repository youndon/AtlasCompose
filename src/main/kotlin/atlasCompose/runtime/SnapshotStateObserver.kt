package atlasCompose.runtime

import androidx.compose.runtime.snapshots.SnapshotStateObserver

private class SnapshotStateObserver {
        val SnapshotStateObserver.ss:Any
        get() = this.apply {
            this.clear()
//            this.clearIf {  }
//            this.notifyChanges()
//            this.observeReads()
            this.start()
            this.stop()
            this.withNoObservations {  }
        }
}