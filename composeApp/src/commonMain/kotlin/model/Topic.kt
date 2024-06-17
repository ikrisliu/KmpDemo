package model

import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

data class Topic(
    val name: StringResource,
    val availableCourses: Int,
    val imageRes: DrawableResource,
)
