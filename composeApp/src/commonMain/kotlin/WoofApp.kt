import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import kmpdemo.composeapp.generated.resources.Res
import kmpdemo.composeapp.generated.resources.about
import kmpdemo.composeapp.generated.resources.app_name
import kmpdemo.composeapp.generated.resources.ic_woof_logo
import kmpdemo.composeapp.generated.resources.years_old
import model.Dog
import model.dogs
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import theme.Theme

@Composable
fun WoofApp() {
    Scaffold(
        topBar = {
            WoofTopAppBar()
        }
    ) { paddings ->
        LazyColumn(
            contentPadding = paddings,
        ) {
            items(dogs) {
                DogItem(
                    dog = it,
                    modifier = Modifier
                        .padding(8.dp)
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WoofTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(Res.drawable.ic_woof_logo),
                        contentDescription = null,
                        modifier = Modifier
                            .size(44.dp)
                            .padding(8.dp)
                    )
                    Text(
                        text = stringResource(Res.string.app_name),
                        style = Theme.typography.titleLarge,
                    )
                }
                Divider(thickness = 0.5.dp)
            }
        },
        modifier = modifier
//            .requiredHeight(44.dp),
    )
}

@Composable
fun DogItem(dog: Dog, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    val color by animateColorAsState(
        targetValue = if (expanded) Theme.colorScheme.tertiaryContainer else Theme.colorScheme.primaryContainer,
    )

    Card(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium,
                    )
                )
                .background(color)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                DogIcon(painterResource(dog.imgRes))
                DogInformation(stringResource(dog.name), dog.age)
                Spacer(Modifier.weight(1f))
                DogItemButton(
                    expanded = expanded,
                    onClick = {
                        expanded = !expanded
                    }
                )
            }

//            AnimatedVisibility(expanded) {
//                DogHobby(
//                    hobby = stringResource(dog.hobbies),
//                    modifier = Modifier.padding(
//                        horizontal = 16.dp,
//                        vertical = 8.dp,
//                    )
//                )
//            }

            if (expanded) {
                DogHobby(
                    hobby = stringResource(dog.hobbies),
                    modifier = Modifier.padding(
                        horizontal = 16.dp,
                        vertical = 8.dp,
                    )
                )
            }
        }
    }
}

@Composable
fun DogIcon(icon: Painter, modifier: Modifier = Modifier) {
    Image(
        painter = icon,
        contentScale = ContentScale.Crop,
        contentDescription = null,
        modifier = modifier
            .size(64.dp)
            .padding(8.dp)
            .clip(Theme.shapes.small)
    )
}

@Composable
fun DogInformation(name: String, age: Int, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = name,
            style = Theme.typography.titleLarge,
            modifier = Modifier
                .padding(top = 8.dp)
        )
        Text(
            text = stringResource(Res.string.years_old, age),
            style = Theme.typography.bodyLarge
        )
    }
}

@Composable
fun DogItemButton(expanded: Boolean, onClick: () -> Unit, modifier: Modifier = Modifier) {
    IconButton(onClick, modifier) {
        Icon(
            imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            contentDescription = null,
            tint = Theme.colorScheme.secondary,
        )
    }
}

@Composable
fun DogHobby(hobby: String, modifier: Modifier = Modifier) {
    Column(modifier) {
        Text(
            text = stringResource(Res.string.about),
            style = Theme.typography.labelSmall,
        )
        Text(
            text = hobby,
            style = Theme.typography.bodyLarge,
        )
    }
}