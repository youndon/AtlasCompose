package atlasCompose.foundation

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.*
import androidx.compose.foundation.interaction.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.*
import androidx.compose.foundation.text.selection.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.mouse.MouseScrollOrientation
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.Dp

@Composable
private fun void() {

    LocalIndication
    LocalScrollbarStyle
    BorderStroke(Dp(1f), Color.Blue)
    BoxWithTooltip(tooltip = {},content = {})
//    Canvas() // FIXME: 15/07/2021
    HorizontalScrollbar(adapter = ScrollbarAdapter(ScrollState(1)))
//    Image() // FIXME: 15/07/2021
    ScrollbarAdapter(ScrollState(1))
    VerticalScrollbar(ScrollbarAdapter(ScrollState(1)))
    defaultScrollbarStyle()
    rememberScrollState()
    rememberScrollbarAdapter(ScrollState(1))
    DraggableState {  }
    ScrollableState { fl: Float -> fl }
    TransformableState { zoomChange: Float, panChange: Offset, rotationChange: Float -> }
    isOrientationMatches(Orientation.Horizontal,MouseScrollOrientation.Horizontal)
    rememberDraggableState {  }
    rememberScrollableState { fl: Float -> fl }
    rememberTransformableState {zoomChange: Float, panChange: Offset, rotationChange: Float ->  }
    MutableInteractionSource()
    Box {}
    BoxWithConstraints {}
    Column{}
    PaddingValues()
    Row{}
    Spacer(Modifier)
    LazyColumn {  }
    LazyRow {  }
//    LazyVerticalGrid(){} // FIXME: 15/07/2021
    rememberLazyListState()
    CircleShape
    ZeroCornerSize
    AbsoluteCutCornerShape(Dp(1f))
    AbsoluteRoundedCornerShape(Dp.Hairline)
    CornerSize(1)
    CutCornerShape(1)
    RoundedCornerShape(1)
    BasicText("")
    BasicTextField("",{})
    ClickableText(AnnotatedString("")){}
    KeyboardActions {  }
    LocalTextSelectionColors
    DisableSelection {  }
    SelectionContainer {  }
    DisableSelection {  }

}