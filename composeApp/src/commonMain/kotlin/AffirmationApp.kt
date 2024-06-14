import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import model.Affirmation
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import service.AffirmationService

@Composable
fun AffirmationApp() {
    AffirmationList(AffirmationService().loadAffirmations())
}

@Composable
fun AffirmationList(affirmationList: List<Affirmation>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(affirmationList) {
            AffirmationCard(
                affirmation = it,
                modifier = Modifier.padding(8.dp),
            )
        }
    }
}

@Composable
fun AffirmationCard(affirmation: Affirmation, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Image(
            painter = painterResource(affirmation.imageResourceId),
            contentDescription = stringResource(affirmation.stringResourceId),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(194.dp)
        )
        Text(
            text = stringResource(affirmation.stringResourceId),
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.headlineSmall,
        )
    }
}