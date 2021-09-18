package atlasCompose.ui

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontSynthesis
import androidx.compose.ui.text.platform.Font

private enum class FontSynthesis {

    /**
     * Turns off font synthesis. Neither bold nor slanted faces are synthesized if they don't
     * exist in the [FontFamily]
     */
    None,

    /**
     * Only a bold font is synthesized, if it is not available in the [FontFamily]. Slanted fonts
     * will not be synthesized.
     */
    Weight,

    /**
     * Only an slanted font is synthesized, if it is not available in the [FontFamily]. Bold fonts
     * will not be synthesized.
     */
    Style,

    /**
     * The system synthesizes both bold and slanted fonts if either of them are not available in
     * the [FontFamily]
     */
    All;
}