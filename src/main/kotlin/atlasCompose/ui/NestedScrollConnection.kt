package atlasCompose.ui

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.unit.Velocity
import kotlinx.coroutines.runBlocking

private interface NestedScrollConnection {
    val NestedScrollConnection.ss: Any
        get() = this.apply {
            runBlocking {
                this@ss.onPostFling(Velocity.Zero, Velocity.Zero)
                this@ss.onPreFling(Velocity.Zero)
            }
            this.onPostScroll(Offset.Zero, Offset.Zero, NestedScrollSource.Drag)
            this.onPreScroll(Offset.Zero, NestedScrollSource.Drag)
        }
}