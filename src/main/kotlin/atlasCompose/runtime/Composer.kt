package atlasCompose.runtime

import androidx.compose.runtime.Composer
import androidx.compose.runtime.InternalComposeApi

private interface Composer {
    @OptIn(InternalComposeApi::class)
    val Composer.ss: Any
        get() = this.apply {
            this.applier
            this.applyCoroutineContext
            this.composition
            this.compositionData
            this.compoundKeyHash
            this.defaultsInvalid
            this.inserting
            this.recomposeScope
            this.skipping
//            this.apply<>()
            this.buildContext()
//            this.changed()
            this.collectParameterInformation()
            this.createNode {  }
            this.disableReusing()
            this.enableReusing()
            this.endDefaults()
            this.endMovableGroup()
            this.endNode()
            this.endProviders()
            this.endReplaceableGroup()
            this.endRestartGroup()
            this.endReusableGroup()
//            this.joinKey()
            this.recordSideEffect {  }
//            this.recordUsed()
            this.rememberedValue()
            this.skipCurrentGroup()
            this.skipToGroupEnd()
//            this.sourceInformation()
            this.sourceInformationMarkerEnd()
//            this.sourceInformationMarkerStart()
            this.startDefaults()
//            this.startMovableGroup()
            this.startNode()
//            this.startProviders()
//            this.startReplaceableGroup()
//            this.startRestartGroup()
//            this.startReusableGroup()
            this.startReusableNode()
//            this.updateRememberedValue()
            this.useNode()
        }
}