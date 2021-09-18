package atlasCompose.runtime

import androidx.compose.runtime.Applier

private interface Applier {
        val <T> Applier<T>.ss:Any
        get() = this.apply {
            this.current
            this.clear()
//            this.down()
//            this.insertBottomUp()
//            this.insertTopDown()
//            this.move()
            this.onBeginChanges()
            this.onEndChanges()
//            this.remove()
            this.up()
        }
}