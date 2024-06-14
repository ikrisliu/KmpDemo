package service

import kmpdemo.composeapp.generated.resources.Res
import kmpdemo.composeapp.generated.resources.affirmation1
import kmpdemo.composeapp.generated.resources.affirmation10
import kmpdemo.composeapp.generated.resources.affirmation2
import kmpdemo.composeapp.generated.resources.affirmation3
import kmpdemo.composeapp.generated.resources.affirmation4
import kmpdemo.composeapp.generated.resources.affirmation5
import kmpdemo.composeapp.generated.resources.affirmation6
import kmpdemo.composeapp.generated.resources.affirmation7
import kmpdemo.composeapp.generated.resources.affirmation8
import kmpdemo.composeapp.generated.resources.affirmation9
import kmpdemo.composeapp.generated.resources.image1
import kmpdemo.composeapp.generated.resources.image10
import kmpdemo.composeapp.generated.resources.image2
import kmpdemo.composeapp.generated.resources.image3
import kmpdemo.composeapp.generated.resources.image4
import kmpdemo.composeapp.generated.resources.image5
import kmpdemo.composeapp.generated.resources.image6
import kmpdemo.composeapp.generated.resources.image7
import kmpdemo.composeapp.generated.resources.image8
import kmpdemo.composeapp.generated.resources.image9
import model.Affirmation

class AffirmationService {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(Res.string.affirmation1, Res.drawable.image1),
            Affirmation(Res.string.affirmation2, Res.drawable.image2),
            Affirmation(Res.string.affirmation3, Res.drawable.image3),
            Affirmation(Res.string.affirmation4, Res.drawable.image4),
            Affirmation(Res.string.affirmation5, Res.drawable.image5),
            Affirmation(Res.string.affirmation6, Res.drawable.image6),
            Affirmation(Res.string.affirmation7, Res.drawable.image7),
            Affirmation(Res.string.affirmation8, Res.drawable.image8),
            Affirmation(Res.string.affirmation9, Res.drawable.image9),
            Affirmation(Res.string.affirmation10, Res.drawable.image10)
        )
    }
}