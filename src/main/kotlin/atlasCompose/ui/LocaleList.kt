package atlasCompose.ui

import androidx.compose.ui.text.intl.LocaleList

private class LocaleList {
    private val LocaleList.ss: Any
        get() = this.apply {
            this.localeList
        }

    init {
        LocaleList.Companion.current
    }
}