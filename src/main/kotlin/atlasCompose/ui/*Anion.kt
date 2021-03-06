package atlasCompose.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.geometry.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.vector.*
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.layout.ScaleFactor
import androidx.compose.ui.platform.*
import androidx.compose.ui.res.*
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.platform.Typeface
import androidx.compose.ui.unit.*
import androidx.compose.ui.window.*
import kotlinx.coroutines.runBlocking
import org.xml.sax.InputSource
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
    ShaderBrush(Shader.makeEmpty())
    SweepGradientShader(Offset.Zero, listOf())
    TransformOrigin(1f,1f)
    useResource("") { loadImageBitmap(it) }
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
    painterResource("")
    loadSvgPainter(InputStream.nullInputStream(), Density(1f))
    InputSource()
    loadXmlImageVector(InputSource(""), Density(1f))
    painterResource("")
    painterResource("")
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
    Typeface(org.jetbrains.skia.Typeface.makeDefault(),"")
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
    TrayState()
    Window({}){}
    WindowPosition(Dp.Hairline, Dp.Hairline)
    DpSize(Dp.Hairline, Dp.Hairline)
    application {  }
    runBlocking {
        awaitApplication {  }
    }
    rememberDialogState()
    rememberTrayState()
    rememberWindowState()
}