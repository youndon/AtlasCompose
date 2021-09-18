package atlasCompose.ui

import androidx.compose.ui.semantics.CollectionInfo

private class CollectionInfo {
    init {
        CollectionInfo(1,1).apply {
            this.columnCount
            this.rowCount
        }
    }
}
