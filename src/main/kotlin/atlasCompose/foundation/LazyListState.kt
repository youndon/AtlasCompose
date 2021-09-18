package compose.foundation

import androidx.compose.foundation.lazy.LazyListState

private class LazyListState {
    init {
        LazyListState.Saver
        LazyListState::firstVisibleItemIndex
        LazyListState::firstVisibleItemScrollOffset
        LazyListState::interactionSource
        LazyListState::layoutInfo
        LazyListState::animateScrollToItem
        LazyListState::scrollToItem
    }
}