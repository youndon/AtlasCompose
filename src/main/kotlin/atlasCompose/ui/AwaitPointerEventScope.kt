package atlasCompose.ui

import androidx.compose.ui.input.pointer.AwaitPointerEventScope

private interface AwaitPointerEventScope {
    val AwaitPointerEventScope.ss: Any
        get() = this.apply {
            this.currentEvent
            this.size
            this.viewConfiguration
//                this.awaitPointerEvent()
//                this.awaitDragOrCancellation()
//                this.awaitFirstDown()
//                this.awaitHorizontalDragOrCancellation()
//                this.awaitHorizontalTouchSlopOrCancellation()
//                this.awaitTouchSlopOrCancellation()
//                this.awaitVerticalDragOrCancellation()
//                this.awaitVerticalTouchSlopOrCancellation()
//                this.drag()
//                this.horizontalDrag()
//                this.verticalDrag()
//                this.waitForUpOrCancellation()
        }
}