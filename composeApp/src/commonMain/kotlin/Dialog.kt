import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

@Composable
fun CommonDialog() {
    var isDialogOpen by remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = { isDialogOpen = true }) {
            Text("Open")
        }
        if (isDialogOpen) {
            AlertDialog(
                onDismissRequest = { },
                confirmButton = {
                    Button(onClick = { isDialogOpen = false }) {
                        Text("OK")
                    }
                },
                title = { Text("Alert Dialog") },
                text = { Text("Lore ipsum") },
            )
        }
    }
}