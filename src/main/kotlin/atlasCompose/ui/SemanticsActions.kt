package atlasCompose.ui

import androidx.compose.ui.semantics.SemanticsActions

private object SemanticsActions {
    init {
        SemanticsActions.apply {
            this.Collapse
            this.CopyText
            this.CustomActions
            this.CutText
            this.Dismiss
            this.Expand
            this.GetTextLayoutResult
            this.OnClick
            this.OnLongClick
            this.PasteText
            this.ScrollBy
            this.ScrollToIndex
            this.SetProgress
            this.SetSelection
            this.SetText
        }
    }
}