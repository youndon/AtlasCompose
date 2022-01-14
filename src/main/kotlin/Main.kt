import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.singleWindowApplication


fun main() = singleWindowApplication {
        Pint()
}

@Composable
fun Pint() {
    Card(modifier = Modifier
        .fillMaxSize(0.5f)
        .padding(20.dp),
        backgroundColor = Color.Magenta,
    shape = RoundedCornerShape(16.dp),){
        Image(painterResource("Images/AmazingDrawings.jpeg"),
            "Singularity",
        contentScale = ContentScale.Crop,
        alignment = Alignment.TopStart,
        modifier = Modifier
            .clickable{})
        Box(modifier = Modifier
                .background(Brush.verticalGradient(
                    colors = listOf(Color.Transparent,Color.Black),
                    startY = 3f
                ))) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            SpanStyle(
                            fontFamily = FontFamily.Monospace
                        )
                        ){
                            append("Cards contain content and actions about a single subject.")
                        }
                    },
                modifier = Modifier
                    .padding(5.dp)
                    .align(Alignment.BottomStart),
                color = Color.White)
            }

    }
}


