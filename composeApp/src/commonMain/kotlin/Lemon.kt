import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.unit.dp
import kmpdemo.composeapp.generated.resources.Res
import kmpdemo.composeapp.generated.resources.lemon_drink
import kmpdemo.composeapp.generated.resources.lemon_restart
import kmpdemo.composeapp.generated.resources.lemon_squeeze
import kmpdemo.composeapp.generated.resources.lemon_tree
import org.jetbrains.compose.resources.painterResource

@Composable
fun Lemon() {
    var currentStep by remember { mutableStateOf(1) }
    val (text, imgRes) = when (currentStep) {
        1 -> "Tap the lemon tree to select a lemon" to Res.drawable.lemon_tree
        2 -> "Keep tapping the lemon to squeeze it" to Res.drawable.lemon_squeeze
        3 -> "Tap the lemonade to drink it" to Res.drawable.lemon_drink
        else -> "Tap the empty glass to start again" to Res.drawable.lemon_restart
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text)
        Spacer(Modifier.padding(32.dp))
        Image(
            painter = painterResource(imgRes),
            contentDescription = "",
            modifier = Modifier
                .wrapContentSize()
                .clickableWithoutRipple {
                    currentStep = 2
                }
        )
    }
}

fun Modifier.clickableWithoutRipple(onClick: () -> Unit): Modifier = composed {
    this.clickable(
        indication = null,
        interactionSource = remember { MutableInteractionSource() }) {
        onClick()
    }
}