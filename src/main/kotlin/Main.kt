import androidx.compose.animation.AnimatedVisibility
import androidx.compose.desktop.Window
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.foundation.text.*
import androidx.compose.material.*
import androidx.compose.material.TextFieldDefaults.BackgroundOpacity
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.SupervisedUserCircle
import androidx.compose.material.icons.outlined.VerifiedUser
import androidx.compose.material.icons.rounded.Android
import androidx.compose.material.icons.twotone.Image
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import org.jetbrains.skija.impl.Log
import java.net.URL

@Composable
fun login() {
    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {


        // text.
        Text(
            "Login User",
            modifier = Modifier
                .padding(20.dp),
            style = TextStyle(
                color = Color.DarkGray,
                fontSize = 25.sp
            )
        )

        field(tx = "Inter User Name.",lab = "Username.",iv = Icons.Filled.SupervisedUserCircle)

        field(tx = "Inter Your Pass.",lab = "Password.",
            iv = Icons.Filled.Password, vt = PasswordVisualTransformation())

        Button(onClick = {

        }, modifier = Modifier){
            Text("Login")
        }
    }


}

@Preview
@Composable
fun primarily() {
    login()
}

fun main() = Window {
    primarily()
}



@Composable
fun field(tx:String = "",
          vt: VisualTransformation= VisualTransformation.None,
          iv:ImageVector=Icons.Filled.Android,
            lab :String ="") {
    val rem = remember { mutableStateOf("") }
    TextField(value = rem.value,
        modifier = Modifier.padding(20.dp),
        onValueChange = { rem.value = it },
        label = { Text(lab) },
        leadingIcon = { Icon(iv, null) },
        placeholder = {Text(tx)},
        visualTransformation = vt
    )
}