package components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

interface `Navigation's` {
    @Composable fun navig() {
        NavigationRail(
            modifier = Modifier,
            backgroundColor = MaterialTheme.colors.surface,
            contentColor = contentColorFor(SnackbarDefaults.backgroundColor),
            elevation = NavigationRailDefaults.Elevation,
            header = @Composable {},
        ) {}

        NavigationRailItem(
            selected = true,
            onClick = {},
            icon = @Composable {},
            modifier = Modifier,
            enabled = true,
            label = @Composable {},
            alwaysShowLabel = true,
            interactionSource = remember { MutableInteractionSource() },
            selectedContentColor = MaterialTheme.colors.primary,
            unselectedContentColor = LocalContentColor.current.copy(alpha = ContentAlpha.medium)
        )

        BottomNavigation(
            modifier = Modifier,
            backgroundColor = MaterialTheme.colors.primarySurface,
            contentColor = contentColorFor(SnackbarDefaults.backgroundColor),
            elevation = BottomNavigationDefaults.Elevation,
            content = {  }
        )
    }
}