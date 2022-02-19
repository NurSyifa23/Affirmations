package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmations

class Datasource() {
    fun loadAffirmations(): List<Affirmations> {
        return listOf<Affirmations>(
            Affirmations("SEMPURNA,SABAH", R.drawable.image1),
            Affirmations("PULAU PERHENTIAN,TERANGGANU", R.drawable.image2),
            Affirmations("LANGKAWI", R.drawable.image3),
            Affirmations("CAMERON HIGHLAND", R.drawable.image4),
            Affirmations("GENTING HIGHLAND", R.drawable.image5),
            Affirmations("BUKIT BENDERA,PULAU PINANG", R.drawable.image6),
            Affirmations("KOMTAR,PULAU PINANG", R.drawable.image7),
            Affirmations("BUKIT TINGGI, PAHANG", R.drawable.image8),
            Affirmations("KUALA LUMPUR", R.drawable.image9),
            Affirmations("TAMBUN,IPOH", R.drawable.image10)
        )
    }
}
