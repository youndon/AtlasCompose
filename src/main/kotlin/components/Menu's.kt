package components

import androidx.compose.foundation.ContextMenuArea
import androidx.compose.foundation.ContextMenuState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.CursorDropdownMenu
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.MenuDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp

interface `Menu's` {
    @OptIn(ExperimentalFoundationApi::class)
    @Composable fun menu(){

        DropdownMenu(
            expanded = true,
            onDismissRequest = {},
            focusable = true,
            modifier = Modifier,
            offset = DpOffset(0.dp, 0.dp),
            content = @Composable {}
        )
        DropdownMenuItem(
            onClick = {},
            modifier = Modifier,
            enabled = true,
            contentPadding = MenuDefaults.DropdownMenuItemContentPadding,
            interactionSource = remember { MutableInteractionSource() },
            content = @Composable {}
        )
        CursorDropdownMenu(
            expanded = true,
            onDismissRequest = {},
            focusable = true,
            modifier = Modifier,
            content = @Composable {}
        )
        ContextMenuArea(
            items =  { listOf() },
            state = remember { ContextMenuState() },
            enabled = true,
        ){}
    }
}