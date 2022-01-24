package components

import androidx.compose.material.*
import androidx.compose.material3.SmallCenteredTopAppBar
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

interface `AppBar's` {
    @Composable fun app() {
        //
        BottomAppBar(
            modifier = Modifier,
            backgroundColor = MaterialTheme.colors.primarySurface,
            contentColor = contentColorFor(SnackbarDefaults.backgroundColor),
            cutoutShape = null,
            elevation = AppBarDefaults.BottomAppBarElevation,
            contentPadding = AppBarDefaults.ContentPadding,
        ) {  }
        //
        BottomAppBar(
            modifier = Modifier,
            backgroundColor = MaterialTheme.colors.primarySurface,
            contentColor = contentColorFor(SnackbarDefaults.backgroundColor),
            cutoutShape = null,
            elevation = AppBarDefaults.BottomAppBarElevation,
            contentPadding = AppBarDefaults.ContentPadding,
        ){}
        //
        SmallTopAppBar(
            title = @Composable {},
            modifier = Modifier,
            navigationIcon = @Composable {},
            actions = @Composable {},
            colors = TopAppBarDefaults.smallTopAppBarColors(),
            scrollBehavior = null
        )
        //
        SmallCenteredTopAppBar(
            title = @Composable {},
            modifier = Modifier,
            navigationIcon = @Composable {},
            actions = @Composable {},
            colors = TopAppBarDefaults.smallCenteredTopAppBarColors(),
            scrollBehavior = null
        )

    }
}