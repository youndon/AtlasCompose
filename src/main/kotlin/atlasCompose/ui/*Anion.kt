package atlasCompose.ui

import androidx.compose.desktop.Window
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.geometry.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.graphics.vector.*
import androidx.compose.ui.input.key.*
import androidx.compose.ui.layout.*
import androidx.compose.ui.platform.*
import androidx.compose.ui.res.*
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.platform.Typeface
import androidx.compose.ui.unit.*
import androidx.compose.ui.window.*
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.v1.*
import kotlinx.coroutines.runBlocking
import org.jetbrains.skija.Typeface
import org.xml.sax.InputSource
import java.awt.Window
import java.io.InputStream

@OptIn(ExperimentalComposeUiApi::class, ExperimentalUnitApi::class)
@Composable
private fun void() {
    CornerRadius(1f,1f)
    Offset(1f,1f)
    Rect(1f,1f,1f,1f)
    RoundRect(1f,1f,1f,1f,1f,1f)
    Size(1f,1f)
    lerp(Dp.Hairline, Dp.Hairline,1f)
    DefaultAlpha
    DefaultCameraDistance
    RectangleShape
    Canvas(ImageBitmap(1,1))
    Color(1)
    GraphicsLayerScope()
    ImageBitmap(1,1)
    ImageShader(ImageBitmap(1,1))
    LinearGradientShader(Offset.Zero, Offset.Zero, listOf())
    Paint()
    PathMeasure()
    RadialGradientShader(Offset.Zero,1f, listOf())
    ShaderBrush(Shader(1))
    SweepGradientShader(Offset.Zero, listOf())
    TransformOrigin(1f,1f)
    imageFromResource("")
//    NativeCanvas // typealias of org.jetbrains.skija.Canvas
//    NativePaint // typealias if org.jetbrains.skija.Paint
//    NativeColorFilter // typealias of  SkijaColorFilter
//    Shader // typealias of org.jetbrains.skija.Shader
    DefaultFillType
    DefaultGroupName
    DefaultPathName
    DefaultPivotX
    DefaultPivotY
    DefaultRotation
    DefaultScaleX
    DefaultScaleY
    DefaultStrokeLineCap
    DefaultStrokeLineJoin
    DefaultStrokeLineMiter
    DefaultStrokeLineWidth
    DefaultTintBlendMode
    DefaultTintColor
    DefaultTranslationX
    DefaultTranslationY
    DefaultTrimPathEnd
    DefaultTrimPathOffset
    DefaultTrimPathStart
    EmptyPath
    RootGroupName
    Group {  }
    Path()
    PathData {  }
    addPathNodes("")
    rememberVectorPainter(Dp.Hairline, Dp.Hairline){viewportWidth: Float, viewportHeight: Float ->  }
    Key(1)
//    NativeKeyEvent // typealias of java.awt.event.KeyEvent
    FirstBaseline
    LastBaseline
//    Layout() // FIXME: 16/07/2021
//    MeasurePolicy() // FIXME: 16/07/2021
    ScaleFactor(1f,1f)
//    SubcomposeLayout { } // FIXME: 16/07/2021
    LocalAccessibilityManager
    LocalAutofill
    LocalAutofillTree
    LocalClipboardManager
    LocalDensity
    LocalFocusManager
    LocalFontLoader
    LocalHapticFeedback
    LocalInspectionMode
    LocalLayoutDirection
    LocalTextInputService
    LocalTextToolbar
    LocalUriHandler
    LocalViewConfiguration
    LocalWindowInfo
    NoInspectorInfo
    isDebugInspectorInfoEnabled
    debugInspectorInfo {  }
    imageResource("")
    loadSvgResource(InputStream.nullInputStream(), Density(1f))
    loadVectorXmlResource(InputSource(), Density(1f))
    svgResource("")
    vectorXmlResource("")
    ToggleableState(false)
    AnnotatedString("")
//    Paragraph() // FIXME: 16/07/2021
    ParagraphIntrinsics("", TextStyle.Default, listOf(), listOf(), Density(1f),object :Font.ResourceLoader{
        override fun load(font: Font): Any {
            TODO("Not yet implemented")
        }
    })
    TextRange(1)
    buildAnnotatedString {  }
    resolveDefaults(TextStyle.Default,LayoutDirection.Ltr)
    FontFamily()
    Font(1)
    Typeface(Typeface.makeDefault(),"")
    Constraints()
    Density(1f,1f)
    DpOffset(Dp.Hairline, Dp.Hairline)
    IntOffset(1,1)
    IntRect(IntOffset.Zero, IntOffset.Zero)
    IntSize(1,1)
    TextUnit(1f, TextUnitType.Sp)
    Velocity(1f,1f)
    max(Dp(1f),Dp(1f))
    min(Dp(1f),Dp(1f))
    isTraySupported
//    AwtWindow() // FIXME: 16/07/2021
//    Dialog() // FIXME: 16/07/2021
    Popup {  }
    Tray()
    Window()
    WindowDraggableArea {  }
    WindowPosition(Dp.Hairline, Dp.Hairline)
    WindowSize(Dp.Hairline, Dp.Hairline)
    application {  }
    runBlocking {
        awaitApplication {  }
    }
    rememberDialogState()
    rememberTrayState()
    rememberWindowState()
    KeyStroke(Key.A)
}