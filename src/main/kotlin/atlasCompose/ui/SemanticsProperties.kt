package atlasCompose.ui

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.semantics.SemanticsProperties

@OptIn(ExperimentalComposeUiApi::class)
private object SemanticsProperties {
    init {
        SemanticsProperties.apply {
            this.CollectionInfo
            this.CollectionItemInfo
            this.ContentDescription
            this.Disabled
            this.EditableText
            this.Error
            this.Focused
            this.Heading
            this.HorizontalScrollAxisRange
            this.ImeAction
            this.IndexForKey
            this.InvisibleToUser
            this.IsDialog
            this.IsPopup
            this.LiveRegion
            this.PaneTitle
            this.Password
            this.ProgressBarRangeInfo
            this.Role
            this.SelectableGroup
            this.Selected
            this.StateDescription
            this.TestTag
            this.Text
            this.TextSelectionRange
            this.ToggleableState
            this.VerticalScrollAxisRange
        }
    }
}