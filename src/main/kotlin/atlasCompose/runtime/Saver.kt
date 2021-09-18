package atlasCompose.runtime

import androidx.compose.runtime.saveable.Saver

private interface Saver {
       val <Original,Saveable:Any> Saver<Original,Saveable>.ss: Original? get() = null
//       get() = this.restore()
}