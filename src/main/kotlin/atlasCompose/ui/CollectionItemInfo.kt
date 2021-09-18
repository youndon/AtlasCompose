package atlasCompose.ui

import androidx.compose.ui.semantics.CollectionItemInfo

private class CollectionItemInfo {
    init {
        CollectionItemInfo(1,1,1,1).apply {
            this.columnIndex
            this.columnSpan
            this.rowIndex
            this.rowSpan
        }
    }
}