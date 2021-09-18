package atlasCompose.ui
import androidx.compose.foundation.Canvas
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.text.Paragraph

private interface Paragraph {
    val Paragraph.ss: Any
        get() = this.apply {
            this.didExceedMaxLines
            this.firstBaseline
            this.height
            this.lastBaseline
            this.lineCount
            this.maxIntrinsicWidth
            this.minIntrinsicWidth
            this.placeholderRects
            this.width
            this.getBidiRunDirection(1)
            this.getBoundingBox(1)
            this.getCursorRect(1)
            this.getLineForOffset(1)
            this.getLineForVerticalPosition(1f)
            this.getLineLeft(1)
            this.getLineBottom(1)
            this.getLineHeight(1)
            this.getLineEnd(1)
            this.getLineRight(1)
            this.getLineWidth(1)
            this.getOffsetForPosition(Offset.Zero)
            this.getLineTop(1)
            this.getLineStart(1)
            this.getPathForRange(1, 1)
            this.getHorizontalPosition(1, true)
            this.getWordBoundary(1)
//            this.paint()
            this.getParagraphDirection(1)
            this.isLineEllipsized(1)
        }
}