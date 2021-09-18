package atlasCompose.ui

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.text.TextLayoutResult

private class TextLayoutResult {
   private val TextLayoutResult.ss: Any
        get() = this.apply {
            // parameters:
            /**
             * The parameters used for computing this text layout result.
             */
            this.layoutInput
            /**
             * The multi paragraph object.
             *
             * This is the result of the text layout computation.
             */
            this.multiParagraph
            /**
             * The amount of space required to paint this text in Int.
             */
            this.size

            // block
            this.didOverflowHeight
            this.didOverflowWidth
            this.firstBaseline
            this.hasVisualOverflow
            this.lastBaseline
            this.lineCount
            this.placeholderRects
            this.getBidiRunDirection(1)
            this.getBoundingBox(1)
            this.getCursorRect(1)
            this.getHorizontalPosition(1, false)
            this.getLineBottom(1)
            this.getLineEnd(1)
            this.getLineForOffset(1)
            this.getLineForVerticalPosition(1f)
            this.getLineLeft(1)
            this.getLineRight(1)
            this.getLineStart(1)
            this.getLineTop(1)
            this.getOffsetForPosition(Offset.Zero)
            this.getParagraphDirection(1)
            this.getPathForRange(1, 1)
            this.getWordBoundary(1)
            this.isLineEllipsized(1)
        }
}