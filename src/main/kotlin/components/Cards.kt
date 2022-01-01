package components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp

object Cards {
    @ExperimentalMaterialApi
    @Composable
    fun card() {
        Card(
            onClick = {
                println("the card is clicked!")
            },
            modifier = Modifier.fillMaxWidth(),
            shape = MaterialTheme.shapes.medium,
            backgroundColor = MaterialTheme.colors.surface,
            contentColor = contentColorFor(SnackbarDefaults.backgroundColor),
            border = BorderStroke(1.dp, Color.Yellow),
            elevation = 1.dp,
            interactionSource = remember { MutableInteractionSource() },
            indication = LocalIndication.current,
            enabled = true,
            onClickLabel = "...",
            role = Role.Button,
            content = {
                Text("""
Material Design card.
Cards contain content and actions about a single subject.
!Cards image 
This version of Card will block clicks behind it. For clickable card, please use another overload that accepts onClick as a parameter.
Params:
modifier - Modifier to be applied to the layout of the card.
shape - Defines the card's shape as well its shadow. A shadow is only displayed if the elevation is greater than zero.
backgroundColor - The background color.
contentColor - The preferred content color provided by this card to its children. Defaults to either the matching content color for backgroundColor, or if backgroundColor is not a color from the theme, this will keep the same value set above this card.
border - Optional border to draw on top of the card
elevation - The z-coordinate at which to place this card.
This controls the size of the shadow below the card.
 Other params is Experimental Material.
            """.trimIndent())
            }
        )
    }
}