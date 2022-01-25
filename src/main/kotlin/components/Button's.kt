package components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
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
                onClick = { },
                modifier = Modifier.clip(CircleShape),
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
            TextButton(
                onClick = {},
                modifier = Modifier,
                enabled = true,
                interactionSource = remember { MutableInteractionSource() },
                elevation = null,
                shape = MaterialTheme.shapes.small,
                border = null,
                colors = ButtonDefaults.textButtonColors(),
                contentPadding = ButtonDefaults.TextButtonContentPadding,
            ) {
                Text("Live Each day as It Your Last.")
            }
            //
            RadioButton(
                selected = true,
                onClick = { },
                modifier = Modifier,
                enabled = true,
                interactionSource = remember { MutableInteractionSource() },
                colors = RadioButtonDefaults.colors(Color.White, Color.Blue),
            )
            //
            OutlinedButton(
                {}, modifier = Modifier,
                colors = ButtonDefaults.buttonColors(Color.DarkGray, Color.LightGray),
                contentPadding = ButtonDefaults.ContentPadding
            )
            {
                Text("OutLine!")
            }
            //
            IconButton(
                onClick = {},
                modifier = Modifier,
                enabled = true,
                interactionSource = remember { MutableInteractionSource() },
            ) {

            }
            //
            IconToggleButton(
                checked = true,
                onCheckedChange = { },
                modifier = Modifier,
                enabled = true,
                interactionSource = remember { MutableInteractionSource() }
            ) {

            }
            //
            FloatingActionButton(
                onClick = {},
                modifier = Modifier,
                interactionSource = remember { MutableInteractionSource() },
                shape = MaterialTheme.shapes.small.copy(CornerSize(percent = 50)),
                backgroundColor = MaterialTheme.colors.secondary,
                contentColor = contentColorFor(backgroundColor),
                elevation = FloatingActionButtonDefaults.elevation()
            ) {
                Text("+")
            }
            //
            ExtendedFloatingActionButton(
                text = @Composable {},
                onClick = {},
                modifier = Modifier,
                icon = @Composable {},
                interactionSource = remember { MutableInteractionSource() },
                shape = MaterialTheme.shapes.small.copy(CornerSize(percent = 50)),
                backgroundColor = MaterialTheme.colors.secondary,
                contentColor = contentColorFor(backgroundColor),
                elevation = FloatingActionButtonDefaults.elevation()
            )
        }
    }
}