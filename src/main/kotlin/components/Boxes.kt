package components

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BoxWithTooltip
import androidx.compose.foundation.TooltipPlacement
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.BadgedBox
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

object Boxes {
    @OptIn(ExperimentalMaterialApi::class, ExperimentalComposeUiApi::class)
    @Composable
    fun bx() {
        var count by remember { mutableStateOf(0) }
        Column {
            //
            Box(
                Modifier.size(100.dp)
                    .background(Color.Gray)
                    .clickable {
                        count++
                    },
                Alignment.Center,
                false
            ) {
                Text(count.toString())
            }
            //
            BoxWithConstraints(
                Modifier.size(100.dp)
                    .background(Color.Yellow)) {
                Text("...")
            }
            //
            BoxWithTooltip(tooltip = {},
                Modifier.size(100.dp)
                    .background(Color.Blue),
                delay = 500,
                tooltipPlacement = TooltipPlacement.CursorPoint()){}
            //
            BadgedBox({}, Modifier.size(100.dp)
                .background(Color.Magenta)){}
        }
    }
}