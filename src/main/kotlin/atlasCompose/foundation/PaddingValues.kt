package compose.foundation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding

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