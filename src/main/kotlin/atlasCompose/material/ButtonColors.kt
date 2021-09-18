package atlasCompose.material

import androidx.compose.material.ButtonColors

private interface ButtonColors {
        val ButtonColors.ss:Any
        get() = this.apply {
//            this.backgroundColor()
//            this.contentColor()
        }
}