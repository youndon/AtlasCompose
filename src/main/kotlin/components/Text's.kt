package components

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.intl.LocaleList
import androidx.compose.ui.text.style.*
import androidx.compose.ui.unit.*

interface `Text's` {
    @Composable fun ts(s:String ) {
        Column(Modifier.padding(20.dp)) {
            //
            ClickableText(
                AnnotatedString(s),
                Modifier
                    .size(50.dp),
                softWrap = true,
                maxLines = 1000,
                overflow = TextOverflow.Visible,
                style = myStyle()
            ) {

            }
            //
            Text(text = s,
                Modifier.fillMaxWidth(),
                overflow = TextOverflow.Ellipsis,
                maxLines = Int.MAX_VALUE,
                onTextLayout = {
                },
                style = myStyle(),
                textAlign = TextAlign.Center
            )
            //
            BasicText(
                text = AnnotatedString(s),
                style = myStyle()
            )

        }
    }
    fun myStyle() = TextStyle(
        color = Color.Black,
        fontSize = 25.sp,
        fontWeight = FontWeight.W500,
        fontStyle = FontStyle.Normal,
        fontSynthesis = FontSynthesis.All,
        fontFamily = FontFamily.SansSerif,
        fontFeatureSettings = "css format",
        letterSpacing = 1.sp,
        baselineShift = BaselineShift.Subscript,
        textGeometricTransform = TextGeometricTransform(),
        localeList = LocaleList.current,
        background = Color.Gray,
        textDecoration = TextDecoration.None,
        shadow = Shadow(Color.Blue),
        textAlign = TextAlign.Justify,
        textDirection = TextDirection.Ltr,
        lineHeight = 30.sp,
        textIndent = TextIndent()
    )
}