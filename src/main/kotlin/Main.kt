import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.ProgressIndicatorDefaults.IndicatorBackgroundOpacity
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


fun main() = application {
    Window({}){
        land()
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun land() {

    TabRow(
        selectedTabIndex = 0,
        modifier = Modifier,
    backgroundColor = MaterialTheme.colors.primarySurface,
    contentColor = contentColorFor(backgroundColor),
    indicator = @Composable { tabPositions ->
        TabRowDefaults.Indicator(
            Modifier.tabIndicatorOffset(tabPositions[0])
        )
    },
    divider = @Composable {
        TabRowDefaults.Divider()
    },
    tabs = @Composable {
        Tab(
            selected = true,
            onClick = {},
            modifier = Modifier,
            enabled = true,
            interactionSource = remember { MutableInteractionSource() },
            selectedContentColor = LocalContentColor.current,
            unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.medium),
            content = @Composable {
                Text("one")
            }
        )
    }
    )
}