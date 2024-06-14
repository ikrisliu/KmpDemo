import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kmpdemo.composeapp.generated.resources.Res
import kmpdemo.composeapp.generated.resources.androidparty
import org.jetbrains.compose.resources.painterResource

@Composable
fun ArtSpace() {
    ArtWall()
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        ArtDescriptor("Artwork title Artwork title Artwork title Artwork title", "Kris", "2024")
        DisplayController()
    }
}

@Composable
fun ArtWall() {
    Box(
        contentAlignment = Alignment.TopCenter,
    ) {
        Surface(
            shadowElevation = 10.dp,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 48.dp)
                .wrapContentSize()
        ) {
            Image(
                painter = painterResource(Res.drawable.androidparty),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .requiredHeight(500.dp)
                    .padding(32.dp)
            )

        }
    }
}

@Composable
fun ArtDescriptor(title: String, artist: String, year: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surfaceContainer)
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Light
//            style = MaterialTheme.typography.bodyLarge,
        )
        Text(
            text = buildAnnotatedString {
                withStyle(
                    SpanStyle(
                        fontWeight = FontWeight.Bold,
                    )
                ) {
                    append(artist)
                }
                append(" ")
                withStyle(
                    SpanStyle(
                        color = MaterialTheme.colorScheme.outline
                    )
                ) {
                    append("($year)")
                }
            },
            style = MaterialTheme.typography.labelSmall,
        )
    }
}

@Composable
fun DisplayController() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
    ) {
        Button(onClick = {}, modifier = Modifier.width(120.dp)) {
            Text("Previous", maxLines = 1, overflow = TextOverflow.Ellipsis)
        }
        Button(onClick = {}, modifier = Modifier.width(120.dp)) {
            Text("Next", maxLines = 1)
        }
    }
}