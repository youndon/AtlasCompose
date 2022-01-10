package components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

interface `Column&Row'` {
    @Composable
    fun some() {
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.Top,
            // Top, Center, Bottom, Start, SpaceBetween, SpaceAround, SpaceEvenly, End
            horizontalAlignment = Alignment.Start,
            // Start,End, Center, CenterStart, CenterEnd, CenterVertically,CenterHorizontally
            // Top,TopStart, TopEnd,TopCenter, Bottom, BottomStart, BottomEnd,
            // BottomCenter
        ) {

        }
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Top,
        ) {

        }
    }
}