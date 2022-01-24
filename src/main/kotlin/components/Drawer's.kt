package components

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

interface `Drawer's` {
    @OptIn(ExperimentalMaterialApi::class)
    @Composable fun dra() {
        BottomDrawer(
            drawerContent = {},
            modifier = Modifier,
            drawerState = rememberBottomDrawerState(BottomDrawerValue.Closed),
            gesturesEnabled = true,
            drawerShape = MaterialTheme.shapes.large,
            drawerElevation = DrawerDefaults.Elevation,
            drawerBackgroundColor = MaterialTheme.colors.surface,
            drawerContentColor = contentColorFor(SnackbarDefaults.backgroundColor),
            scrimColor = DrawerDefaults.scrimColor,
            content = { }
        )

        //
        ModalDrawer(
            drawerContent = @Composable {},
            modifier = Modifier,
            drawerState = rememberDrawerState(DrawerValue.Closed),
            gesturesEnabled = true,
            drawerShape = MaterialTheme.shapes.large,
            drawerElevation = DrawerDefaults.Elevation,
            drawerBackgroundColor = MaterialTheme.colors.surface,
            drawerContentColor = contentColorFor(MaterialTheme.colors.surface),
            scrimColor = DrawerDefaults.scrimColor,
        ) {}
    }
}