package compose.foundation

import androidx.compose.foundation.layout.PaddingValues

private interface PaddingValues {
    val PaddingValues.ss: Any
        get() = this.apply {
            this.calculateBottomPadding()
//            this.calculateLeftPadding()
//            this.calculateRightPadding()
            this.calculateTopPadding()
//            this.calculateEndPadding()
//            this.calculateStartPadding()
        }
}