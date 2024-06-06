import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kmpdemo.composeapp.generated.resources.Res
import kmpdemo.composeapp.generated.resources.android_logo
import org.jetbrains.compose.resources.painterResource

@Composable
fun BusinessCard() {
    IdentityInfo("Jennifer Doe", "Android Developer Extraordinary")
    ContactInfo()
}

@Composable
fun IdentityInfo(fullName: String, title: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(Res.drawable.android_logo),
            contentDescription = "",
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xFF073042)),
        )
        Text(
            text = fullName,
            fontSize = 32.sp,
            modifier = Modifier
                .padding(top = 4.dp),
        )
        Text(
            text = title,
            color = Color(0xFF3ddc84),
        )
    }
}

@Composable
fun ContactInfo(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .padding(16.dp),
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
        ) {
            ContactItem(Icons.Default.Phone, "+1 (123) 444 555 666")
            ContactItem(Icons.Default.Share, "@AndroidDev")
            ContactItem(Icons.Default.Email, "kris.liu@farfetch.com")
        }
    }
}

@Composable
fun ContactItem(icon: ImageVector, text: String) {
    Row {
        Icon(
            icon,
            contentDescription = "",
        )
        Spacer(
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = text,
        )
    }
}