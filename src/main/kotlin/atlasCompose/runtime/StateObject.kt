package atlasCompose.runtime

import androidx.compose.runtime.snapshots.StateRecord

private abstract class StateObject {
    val StateRecord.ss: Any
        get() = this.apply {
//            this.assign()
            this.create()
        }
}