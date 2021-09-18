package atlasCompose.ui

import androidx.compose.ui.text.ParagraphIntrinsics

private interface ParagraphIntrinsics {
    val ParagraphIntrinsics.ss: Any
        get() = this.apply {
            this.maxIntrinsicWidth
            this.minIntrinsicWidth
        }
}