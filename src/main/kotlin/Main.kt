
import androidx.compose.desktop.Window
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Android
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.SupervisedUserCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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