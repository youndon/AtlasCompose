import androidx.compose.animation.AnimatedVisibility
import androidx.compose.desktop.Window
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Notification
import kotlin.system.exitProcess

@OptIn(ExperimentalUnitApi::class)
@Preview
@Composable
fun land() {
    Column {
        Button(
            onClick = {
                println("clicked")
            }, Modifier,
            enabled = true,
            interactionSource = remember { MutableInteractionSource() },
            elevation = null,
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(5.dp, Color(6464631)),
            colors = ButtonDefaults.buttonColors(Color.Blue, Color.White),
            contentPadding = ButtonDefaults.ContentPadding
        ) {
            Column {
                Text("NeverLand")
            }
        }
        Spacer(Modifier.height(10.dp))
       TextButton({
                  println("text button!!")
       },
           colors = ButtonDefaults.buttonColors(Color.White,Color.Gray),
       ){
           Text("Live Each day as It Your Last.") }
       RadioButton(onClick = {

        },modifier = Modifier,
           enabled =  true,
            interactionSource = remember { MutableInteractionSource() },
            selected = false,
            colors = RadioButtonDefaults.colors(Color.White,Color.Blue)
        )
        OutlinedButton({},modifier = Modifier,
        enabled = true,
        interactionSource = remember { MutableInteractionSource() },
        elevation = null,
        shape = MaterialTheme.shapes.medium,
        border = ButtonDefaults.outlinedBorder,
        colors = ButtonDefaults.buttonColors(Color.DarkGray, Color.LightGray),
        contentPadding = ButtonDefaults.ContentPadding)
        {
            Text("OutLine!")
        }
    }
}

fun main() = Window {
    land()
}