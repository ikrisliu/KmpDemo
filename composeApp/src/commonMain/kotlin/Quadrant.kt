import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kmpdemo.composeapp.generated.resources.Res
import kmpdemo.composeapp.generated.resources.first_description
import kmpdemo.composeapp.generated.resources.first_title
import kmpdemo.composeapp.generated.resources.fourth_description
import kmpdemo.composeapp.generated.resources.fourth_title
import kmpdemo.composeapp.generated.resources.second_description
import kmpdemo.composeapp.generated.resources.second_title
import kmpdemo.composeapp.generated.resources.third_description
import kmpdemo.composeapp.generated.resources.third_title
import org.jetbrains.compose.resources.stringResource

@Composable
fun Quadrant() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            InfoCard(
                title = stringResource(Res.string.first_title),
                description = stringResource(Res.string.first_description),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f),
            )
            InfoCard(
                title = stringResource(Res.string.second_title),
                description = stringResource(Res.string.second_description),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f),
            )
        }
        Row(Modifier.weight(1f)) {
            InfoCard(
                title = stringResource(Res.string.third_title),
                description = stringResource(Res.string.third_description),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f),
            )
            InfoCard(
                title = stringResource(Res.string.fourth_title),
                description = stringResource(Res.string.fourth_description),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f),
            )
        }
    }
}

@Composable
fun InfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            style = TextStyle.Default.copy(
                lineBreak = LineBreak.Paragraph,
            )
        )
    }
}