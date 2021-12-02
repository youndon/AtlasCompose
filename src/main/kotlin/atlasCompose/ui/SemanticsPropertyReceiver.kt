package atlasCompose.ui

import androidx.compose.ui.semantics.*
import androidx.compose.ui.semantics.SemanticsPropertyReceiver

private interface SemanticsPropertyReceiver {
    val SemanticsPropertyReceiver.ss: Any
        get() = this.apply {
            this.collectionInfo
            this.collectionItemInfo
            this.contentDescription
            this.customActions
            this.editableText
            this.focused
            this.horizontalScrollAxisRange
            this.imeAction
            this.liveRegion
            this.paneTitle
            this.progressBarRangeInfo
            this.role
            this.selected
            this.stateDescription
            this.testTag
            this.text
            this.textSelectionRange
            this.toggleableState
            this.verticalScrollAxisRange
//            this.setText {  }
//            this.setProgress {  }
//            this.collapse {  }
//            this.copyText {  }
//            this.cutText {  }
            this.dialog()
            this.disabled()
//            this.dismiss {  }
//            this.error()
//            this.expand {  }
//            this.getTextLayoutResult {  }
            this.heading()
//            this.indexForKey {  }
//            this.invisibleToUser()
//            this.onClick {  }
//            this.onLongClick {  }
            this.password()
//            this.pasteText {  }
            this.popup()
//            this.scrollBy { x, y ->  }
//            this.scrollToIndex {  }
            this.selectableGroup()
//            this.setSelection { startIndex, endIndex, traversalMode ->  }
        }
}