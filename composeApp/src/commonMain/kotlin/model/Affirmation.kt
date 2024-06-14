package model

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

data class Affirmation(
    val stringResourceId: StringResource,
    val imageResourceId: DrawableResource,
)
