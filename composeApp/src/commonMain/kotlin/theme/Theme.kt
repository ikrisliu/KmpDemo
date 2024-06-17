package theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
fun Theme(
    darkMode: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkMode) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content,
    )
}

private val DarkColorScheme = darkColorScheme(
    primary = DarkColors.primary,
    secondary = DarkColors.secondary,
    tertiary = DarkColors.tertiary,
)

private val LightColorScheme = lightColorScheme(
    primary = LightColors.primary,
    secondary = LightColors.secondary,
    tertiary = LightColors.tertiary,
)

private val Typography = Typography(
    displayLarge = TextStyles.displayLarge,
)