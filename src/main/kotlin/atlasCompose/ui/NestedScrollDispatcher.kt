package atlasCompose.ui

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.unit.Velocity
import kotlinx.coroutines.runBlocking

private class NestedScrollDispatcher {
    init {
        NestedScrollDispatcher().apply {
            this.coroutineScope
            runBlocking {
                this@apply.dispatchPostFling(Velocity.Zero, Velocity.Zero)
                this@apply.dispatchPreFling(Velocity.Zero)
            }
            this.dispatchPostScroll(Offset.Zero, Offset.Zero, NestedScrollSource.Drag)
            this.dispatchPreScroll(Offset.Zero, NestedScrollSource.Drag)
        }
    }
}