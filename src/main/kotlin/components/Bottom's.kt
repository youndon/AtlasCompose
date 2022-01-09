package components

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


interface `Bottom's` {
    @OptIn(ExperimentalMaterialApi::class)
    @Composable
    fun bottoms() {
        //
        BottomAppBar(
            modifier = Modifier,
            backgroundColor = MaterialTheme.colors.primarySurface,
            contentColor = contentColorFor(backgroundColor),
            cutoutShape = MaterialTheme.shapes.medium,
            elevation = AppBarDefaults.BottomAppBarElevation,
            contentPadding = AppBarDefaults.ContentPadding,
            content = {
            }
        )

        //
        BottomDrawer(
            drawerContent = {},
            modifier = Modifier,
            drawerState = rememberBottomDrawerState(BottomDrawerValue.Closed),
            gesturesEnabled = true,
            drawerShape = MaterialTheme.shapes.large,
            drawerElevation = DrawerDefaults.Elevation,
            drawerBackgroundColor = MaterialTheme.colors.surface,
            drawerContentColor = contentColorFor(backgroundColor),
            scrimColor = DrawerDefaults.scrimColor,
            content = {  }
        )

        //
        BottomNavigation(
            modifier = Modifier,
            backgroundColor = MaterialTheme.colors.primarySurface,
            contentColor = contentColorFor(backgroundColor),
            elevation = BottomNavigationDefaults.Elevation,
            content = {  }
        )

        //
        BottomSheetScaffold(
            sheetContent = {},
            modifier = Modifier,
            scaffoldState = rememberBottomSheetScaffoldState(),
            topBar = @Composable {},
            snackbarHost  = @Composable { SnackbarHost(it) },
            floatingActionButton = @Composable {},
            floatingActionButtonPosition = FabPosition.End,
            sheetGesturesEnabled = true,
            sheetElevation = BottomSheetScaffoldDefaults.SheetElevation,
            sheetShape = MaterialTheme.shapes.large,
            sheetBackgroundColor = MaterialTheme.colors.surface,
            sheetContentColor = contentColorFor(backgroundColor),
            sheetPeekHeight = BottomSheetScaffoldDefaults.SheetPeekHeight,
            drawerContent = @Composable {},
            drawerGesturesEnabled = true,
            drawerShape = MaterialTheme.shapes.large,
            drawerElevation = DrawerDefaults.Elevation,
            drawerBackgroundColor = MaterialTheme.colors.surface,
            drawerContentColor = contentColorFor(backgroundColor),
            drawerScrimColor = DrawerDefaults.scrimColor,
            backgroundColor = MaterialTheme.colors.background,
            contentColor = contentColorFor(backgroundColor),
            content = @Composable {}
        )

        //
        ModalBottomSheetLayout(
            sheetContent = @Composable {} ,
            modifier = Modifier,
            sheetState = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden),
            sheetShape = MaterialTheme.shapes.large,
            sheetElevation = ModalBottomSheetDefaults.Elevation,
            sheetBackgroundColor = MaterialTheme.colors.surface,
            sheetContentColor = contentColorFor(backgroundColor),
            scrimColor = ModalBottomSheetDefaults.scrimColor,
            content = @Composable {}
        )
    }
}