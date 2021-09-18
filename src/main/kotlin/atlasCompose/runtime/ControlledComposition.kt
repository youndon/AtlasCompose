package atlasCompose.runtime

import androidx.compose.runtime.ControlledComposition
import androidx.compose.runtime.InternalComposeApi

private interface ControlledComposition {
    @OptIn(InternalComposeApi::class)
    val ControlledComposition.ss: Any
        get() = this.apply {
            this.hasPendingChanges
            this.isComposing
            this.applyChanges()
            this.composeContent { }
            this.invalidateAll()
//        this.observesAnyOf()
            this.prepareCompose { }
            this.recompose()
//        this.recordModificationsOf()
//        this.recordReadOf()
//        this.recordWriteOf()
            this.verifyConsistent()
        }
}