package service

import kmpdemo.composeapp.generated.resources.Res
import kmpdemo.composeapp.generated.resources.architecture
import kmpdemo.composeapp.generated.resources.automotive
import kmpdemo.composeapp.generated.resources.biology
import kmpdemo.composeapp.generated.resources.business
import kmpdemo.composeapp.generated.resources.crafts
import kmpdemo.composeapp.generated.resources.culinary
import kmpdemo.composeapp.generated.resources.design
import kmpdemo.composeapp.generated.resources.drawing
import kmpdemo.composeapp.generated.resources.ecology
import kmpdemo.composeapp.generated.resources.engineering
import kmpdemo.composeapp.generated.resources.fashion
import kmpdemo.composeapp.generated.resources.film
import kmpdemo.composeapp.generated.resources.finance
import kmpdemo.composeapp.generated.resources.gaming
import kmpdemo.composeapp.generated.resources.geology
import kmpdemo.composeapp.generated.resources.history
import kmpdemo.composeapp.generated.resources.journalism
import kmpdemo.composeapp.generated.resources.law
import kmpdemo.composeapp.generated.resources.lifestyle
import kmpdemo.composeapp.generated.resources.music
import kmpdemo.composeapp.generated.resources.painting
import kmpdemo.composeapp.generated.resources.photography
import kmpdemo.composeapp.generated.resources.physics
import kmpdemo.composeapp.generated.resources.tech
import model.Topic

object TopicService {
    val topics = listOf(
        Topic(Res.string.architecture, 58, Res.drawable.architecture),
        Topic(Res.string.automotive, 30, Res.drawable.automotive),
        Topic(Res.string.biology, 90, Res.drawable.biology),
        Topic(Res.string.crafts, 121, Res.drawable.crafts),
        Topic(Res.string.business, 78, Res.drawable.business),
        Topic(Res.string.culinary, 118, Res.drawable.culinary),
        Topic(Res.string.design, 423, Res.drawable.design),
        Topic(Res.string.ecology, 28, Res.drawable.ecology),
        Topic(Res.string.engineering, 67, Res.drawable.engineering),
        Topic(Res.string.fashion, 92, Res.drawable.fashion),
        Topic(Res.string.finance, 100, Res.drawable.finance),
        Topic(Res.string.film, 165, Res.drawable.film),
        Topic(Res.string.gaming, 37, Res.drawable.gaming),
        Topic(Res.string.geology, 290, Res.drawable.geology),
        Topic(Res.string.drawing, 326, Res.drawable.drawing),
        Topic(Res.string.history, 189, Res.drawable.history),
        Topic(Res.string.journalism, 96, Res.drawable.journalism),
        Topic(Res.string.law, 58, Res.drawable.law),
        Topic(Res.string.lifestyle, 305, Res.drawable.lifestyle),
        Topic(Res.string.music, 212, Res.drawable.music),
        Topic(Res.string.painting, 172, Res.drawable.painting),
        Topic(Res.string.photography, 321, Res.drawable.photography),
        Topic(Res.string.physics, 41, Res.drawable.physics),
        Topic(Res.string.tech, 118, Res.drawable.tech),
    )
}