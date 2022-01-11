import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.ProgressIndicatorDefaults.IndicatorBackgroundOpacity
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.ResourceLoader
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Notification
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.skia.impl.Log


fun main() = singleWindowApplication(title = "Ubuntu") {
    Pint()
}

@Composable
fun Pint() {
    Card(modifier = Modifier
        .fillMaxSize(0.5f)
        .padding(20.dp),
        backgroundColor = Color.Magenta,
    shape = RoundedCornerShape(16.dp),){
//        Image(painterResource(""),"Singularity")
        Box(modifier = Modifier
                .background(Brush.verticalGradient(
                    colors = listOf(Color.Transparent,Color.Black),
                    startY = 3f
                ))) {
                Text("Material Design card.\n" +
                        "Cards contain content and actions about a single subject.\n" +
                        "!Cards image \n" +
                        "This version of Card will block clicks behind it. For clickable card, please use another overload that accepts onClick as a parameter.",
                modifier = Modifier
                    .padding(5.dp)
                    .align(Alignment.BottomStart),
                color = Color.White)
            }

    }
}
