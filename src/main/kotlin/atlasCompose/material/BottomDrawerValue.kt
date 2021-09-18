package atlasCompose.material

import androidx.compose.material.BottomDrawerValue

private enum class BottomDrawerValue {

    /**
     * The state of the bottom drawer when it is closed.
     */
    Closed,

    /**
     * The state of the bottom drawer when it is open (i.e. at 50% height).
     */
    Open,

    /**
     * The state of the bottom drawer when it is expanded (i.e. at 100% height).
     */
    Expanded
}