package model

import kmpdemo.composeapp.generated.resources.Res
import kmpdemo.composeapp.generated.resources.bella
import kmpdemo.composeapp.generated.resources.dog_description_1
import kmpdemo.composeapp.generated.resources.dog_description_2
import kmpdemo.composeapp.generated.resources.dog_description_3
import kmpdemo.composeapp.generated.resources.dog_description_4
import kmpdemo.composeapp.generated.resources.dog_description_5
import kmpdemo.composeapp.generated.resources.dog_description_6
import kmpdemo.composeapp.generated.resources.dog_description_7
import kmpdemo.composeapp.generated.resources.dog_description_8
import kmpdemo.composeapp.generated.resources.dog_description_9
import kmpdemo.composeapp.generated.resources.dog_name_1
import kmpdemo.composeapp.generated.resources.dog_name_2
import kmpdemo.composeapp.generated.resources.dog_name_3
import kmpdemo.composeapp.generated.resources.dog_name_4
import kmpdemo.composeapp.generated.resources.dog_name_5
import kmpdemo.composeapp.generated.resources.dog_name_6
import kmpdemo.composeapp.generated.resources.dog_name_7
import kmpdemo.composeapp.generated.resources.dog_name_8
import kmpdemo.composeapp.generated.resources.dog_name_9
import kmpdemo.composeapp.generated.resources.faye
import kmpdemo.composeapp.generated.resources.frankie
import kmpdemo.composeapp.generated.resources.koda
import kmpdemo.composeapp.generated.resources.leroy
import kmpdemo.composeapp.generated.resources.lola
import kmpdemo.composeapp.generated.resources.moana
import kmpdemo.composeapp.generated.resources.nox
import kmpdemo.composeapp.generated.resources.tzeitel
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

data class Dog(
    val imgRes: DrawableResource,
    val name: StringResource,
    val age: Int,
    val hobbies: StringResource,
)

val dogs = listOf(
    Dog(Res.drawable.koda, Res.string.dog_name_1, 2, Res.string.dog_description_1),
    Dog(Res.drawable.lola, Res.string.dog_name_2, 16, Res.string.dog_description_2),
    Dog(Res.drawable.frankie, Res.string.dog_name_3, 2, Res.string.dog_description_3),
    Dog(Res.drawable.nox, Res.string.dog_name_4, 8, Res.string.dog_description_4),
    Dog(Res.drawable.faye, Res.string.dog_name_5, 8, Res.string.dog_description_5),
    Dog(Res.drawable.bella, Res.string.dog_name_6, 14, Res.string.dog_description_6),
    Dog(Res.drawable.moana, Res.string.dog_name_7, 2, Res.string.dog_description_7),
    Dog(Res.drawable.tzeitel, Res.string.dog_name_8, 7, Res.string.dog_description_8),
    Dog(Res.drawable.leroy, Res.string.dog_name_9, 4, Res.string.dog_description_9)
)