package atlasCompose.ui

import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.asDesktopPathEffect

private interface PathEffect {
    val PathEffect.ss: Any
        get() = this.asDesktopPathEffect()

    companion object{
        init {
            PathEffect.Companion.apply {
//            this.chainPathEffect()
//            this.cornerPathEffect()
//            this.dashPathEffect()
//            this.stampedPathEffect()
            }
        }
    }
}