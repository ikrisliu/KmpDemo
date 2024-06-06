import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun App() {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
//            GreetingImage(
//                message = "Happy Birthday",
//                from = stringResource(Res.string.title),
//            )
//            CommonDialog()
//            Quadrant()
//            BusinessCard()
//            Dice()
//            Lemon()
//            TipTimeLayout()
            ArtSpace()
        }
    }
}