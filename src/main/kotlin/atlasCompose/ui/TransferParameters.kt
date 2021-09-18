package atlasCompose.ui

import androidx.compose.ui.graphics.colorspace.TransferParameters

private class TransferParameters {
    init {
        TransferParameters(1.1,1.1,1.1,1.1,1.1).apply {
            // parameters:
            /** Value g in the equation of the EOTF described above.  */
            this.gamma
            /** Value a in the equation of the EOTF described above.  */
            this.a
            /** Value b in the equation of the EOTF described above.  */
            this.b
            /** Value c in the equation of the EOTF described above.  */
            this.c
            /** Value d in the equation of the EOTF described above.  */
            this.d
            /** Value e in the equation of the EOTF described above.  */
            this.e
            /** Value f in the equation of the EOTF described above.  */
            this.f
        }
    }
}