package atlasCompose.runtime

import androidx.compose.runtime.ProduceStateScope
import kotlinx.coroutines.runBlocking

private interface ProduceStateScope {
    val <T> ProduceStateScope<T>.ss: Any
        get() = runBlocking {
            this@ss.awaitDispose { }
        }
}