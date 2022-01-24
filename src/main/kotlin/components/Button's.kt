package components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

interface `Button's` {
    @Composable fun bs() {
        Column {
            //
            Button(
                onClick = {

                }, Modifier.clip(CircleShape),
                enabled = true,
                interactionSource = remember { MutableInteractionSource() },
                elevation = null,
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(5.dp, Color(6464631)),
                colors = ButtonDefaults.buttonColors(Color.Blue, Color.White),
                contentPadding = ButtonDefaults.ContentPadding,
            ) {
                Text("NeverLand")
            }
            //
            TextButton({
                println("text button!!")
            },
                colors = ButtonDefaults.buttonColors(Color.White, Color.Gray),
            ){
                Text("Live Each day as It Your Last.") }
            //
            RadioButton(onClick = {

            },modifier = Modifier,
                interactionSource = remember { MutableInteractionSource() },
                selected = true,
                colors = RadioButtonDefaults.colors(Color.White,Color.Blue),
            )
            //
            OutlinedButton({},modifier = Modifier,
                colors = ButtonDefaults.buttonColors(Color.DarkGray, Color.LightGray),
                contentPadding = ButtonDefaults.ContentPadding)
            {
                Text("OutLine!")
            }
            //
            IconButton(onClick = {}){

            }
            //
            IconToggleButton(
                checked = true,
                onCheckedChange = {},
                Modifier,){
                Text("toggle")
            }
            //
            FloatingActionButton({

            }){
                Text("+")
            }
            //
            ExtendedFloatingActionButton({},{})
        }
    }

}