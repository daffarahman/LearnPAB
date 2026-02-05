package com.madebydap.learnpab.profile

import androidx.annotation.DrawableRes
import com.madebydap.learnpab.R

data class Profile(
    val name: String,
    val email: String,
    @DrawableRes val image: Int
)

val profiles = listOf<Profile>(
    Profile(
        name = "Daffa Rahman",
        email = "daffa@madebydap.com",
        image = R.drawable.guy
    ),
    Profile(
        name = "Rivan Purnama",
        email = "rivan@madebydap.com",
        image = R.drawable.guy
    ),
    Profile(
        name = "Zidan Dicky",
        email = "zidan@madebydap.com",
        image = R.drawable.guy
    )
)