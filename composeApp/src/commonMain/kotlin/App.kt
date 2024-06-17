import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun App() {
//    parseJson()

    val layoutDirection = LocalLayoutDirection.current

    MaterialTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .padding(
                    start = WindowInsets.safeDrawing.asPaddingValues()
                        .calculateStartPadding(layoutDirection),
                    end = WindowInsets.safeDrawing.asPaddingValues()
                        .calculateEndPadding(layoutDirection),
                ),
            color = MaterialTheme.colorScheme.background,
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
//            ArtSpace()
//            AffirmationApp()
            TopicGrid(modifier = Modifier.padding(8.dp))
        }
    }
}


fun parseJson() {
    val json = Json {
        ignoreUnknownKeys = true
    }
    val rules = json.decodeFromString<List<Rule>>(jsonStr)

    val result = rules.filter { rule ->
        if (rule.conditions.count() != 2) return@filter false

        val country = rule.conditions.firstOrNull {
            it.propertyName == "ShippingAddressCountryCode"
        }
        val phone = rule.conditions.firstOrNull {
            it.propertyName == "ShippingAddressPhone"
        }
//        val city = rule.conditions.firstOrNull {
//            it.propertyName == "ShippingAddressCity"
//        }
//        val addressLine1 = rule.conditions.firstOrNull {
//            it.propertyName == "ShippingAddressLine1"
//        }

        val ok = country?.operator == "Is" && country.value == "CN" &&
                phone?.operator == "Is" && phone.value.isNotBlank()
//                && city != null && addressLine1 != null

        rule.expiryTime.isNullOrEmpty() && rule.enabled && ok &&
                rule.limiter.countBy == "Quantity" && rule.limiter.maximum == 0
    }
    val phones = result.map { rule ->
        rule.conditions.first {
            it.propertyName == "ShippingAddressPhone"
        }.value.trim().takeLast(11)
    }.toSet()

    phones.forEach {
        println(it)
    }
}

@Serializable
data class Rule(
    val name: String,
    val enabled: Boolean,
    val expiryTime: String? = null,
    val conditions: Set<Condition>,
    val limiter: Limiter,
)

@Serializable
data class Condition(
    val operator: String,
    val propertyName: String,
    val value: String,
)

@Serializable
data class Limiter(
    val groupBy: String,
    val countBy: String,
    val maximum: Int,
)

const val jsonStr = ""