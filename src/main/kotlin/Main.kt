import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.rememberNotification
import androidx.compose.ui.window.singleWindowApplication
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


@OptIn(ExperimentalMaterialApi::class)
fun main() = singleWindowApplication { Effect() }

@Composable
fun Coloring() {
    val cr = remember { mutableStateOf(Color.Cyan) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        Card(
            modifier = Modifier
                .size(500.dp,400.dp)
                .clickable {
                    cr.value = Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat()
                    )
                },
            backgroundColor = cr.value
        ) {

        }
    }
}
@Composable
fun Snaking() {
    var textState by remember { mutableStateOf("") }
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
                .background(Color.DarkGray)
        ) {
            TextField(
                value = textState,
                onValueChange = {
                    textState = it
                }
            )
            Spacer(Modifier.height(30.dp))
            Button({
                scope.launch {
                    scaffoldState.snackbarHostState.showSnackbar(textState,"dismiss",SnackbarDuration.Long)
                }
            }) {
                Text("Showing!!")
            }
        }
    }
}

@Composable
fun Effect() {
    val scaffold = rememberScaffoldState()
    Scaffold(scaffoldState = scaffold) {
//        var c by remember { mutableStateOf(0) }
        val c = produceState(0){ delay(2000) ;value = 11 }
        if (c.value % 2 == 0 && c.value != 0){
            LaunchedEffect(scaffold.snackbarHostState) {
                scaffold.snackbarHostState.showSnackbar("The Count's $c")
            }
        }
        Button({ }){
            Text("count! ${c.value}")
        }
    }
}
