import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kmpdemo.composeapp.generated.resources.Res
import kmpdemo.composeapp.generated.resources.dice_1
import kmpdemo.composeapp.generated.resources.dice_2
import kmpdemo.composeapp.generated.resources.dice_3
import kmpdemo.composeapp.generated.resources.dice_4
import kmpdemo.composeapp.generated.resources.dice_5
import kmpdemo.composeapp.generated.resources.dice_6
import org.jetbrains.compose.resources.painterResource

@Composable
fun Dice(
    modifier: Modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
) {
    var result by remember { mutableStateOf(1) }
    val imgRes = when (result) {
        1 -> Res.drawable.dice_1
        2 -> Res.drawable.dice_2
        3 -> Res.drawable.dice_3
        4 -> Res.drawable.dice_4
        5 -> Res.drawable.dice_5
        else -> Res.drawable.dice_6
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(imgRes),
            contentDescription = result.toString(),
        )
        Spacer(Modifier.padding(16.dp))
        Button(onClick = {
            result = (1..6).random()
        }) {
            Text("Roll")
        }
    }
}