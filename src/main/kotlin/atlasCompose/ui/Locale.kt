package atlasCompose.ui

import androidx.compose.ui.text.intl.Locale

private class Locale {
    private val Locale.ss: Any
        get() = this.apply {
            this.language
            this.region
            this.script
            this.toLanguageTag()
        }

    init {
        Locale.Companion.current
    }
}