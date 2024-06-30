package com.thiago.animals.data

import com.thiago.animals.R

object AnimalsDataSource {
    val animalList = listOf(
        Animals(
            id = 0,
            name = "Whiskers",
            age = "Adult",
            gender = "Female",
            color = "Striped",
            breed = "Maine Coon",
            location = "São Paulo, BR",
            image = R.drawable.gato,
            description = "Whiskers, a graceful Siamese cat, loves lounging in sunny spots and has a soft, melodious purr."
        ),
        Animals(
            id = 1,
            name = "Buddy",
            age = "Puppy",
            gender = "Male",
            color = "Black and Brown",
            breed = "Beauceron",
            location = "Toronto, CA",
            image = R.drawable.dog,
            description = "Buddy, a playful Labrador Retriever puppy, enjoys fetching balls and is always full of energy."
        ),
        Animals(
            id = 2,
            name = "Tweety",
            age = "Young",
            gender = "Male",
            color = "Green",
            breed = "Budgerigar",
            location = "Rio de Janeiro, BR",
            image = R.drawable.periquito,
            description = "Tweety, a vibrant green budgerigar, loves singing and mimicking sounds around him."
        ),
        Animals(
            id = 3,
            name = "Nibbles",
            age = "Baby",
            gender = "Female",
            color = "White and Brown",
            breed = "Syrian Hamster",
            location = "New York, US",
            image = R.drawable.hamister,
            description = "Nibbles, a tiny Syrian hamster, enjoys running on her wheel and nibbling on fresh veggies."
        )
    )
}
