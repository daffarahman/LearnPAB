package com.madebydap.learnpab.profile

import androidx.annotation.DrawableRes
import com.madebydap.learnpab.R

data class ProfileData(
    val id: Int,
    val name: String,
    val email: String,
    @DrawableRes val image: Int
)

fun getProfileById(id: Int): ProfileData {
    for (p in profiles) {
        if(p.id == id) {
            return p;
        }
    }
    return ProfileData(
        id = -1,
        name = "Unknow",
        email = "unknown@mail.com",
        image = R.drawable.guy
    );
}
val profiles = listOf<ProfileData>(
    ProfileData(
        id = 1,
        name = "Daffa Rahman",
        email = "daffa@madebydap.com",
        image = R.drawable.guy
    ),
    ProfileData(
        id = 2,
        name = "Rivan Purnama",
        email = "rivan@madebydap.com",
        image = R.drawable.guy
    ),
    ProfileData(
        id = 3,
        name = "Zidan Dicky",
        email = "zidan@madebydap.com",
        image = R.drawable.guy
    ),
    ProfileData(
        id = 4,
        name = "Andi Pratama",
        email = "andi@madebydap.com",
        image = R.drawable.guy
    ),
    ProfileData(
        id = 5,
        name = "Bima Saputra",
        email = "bima@madebydap.com",
        image = R.drawable.guy
    ),
    ProfileData(
        id = 6,
        name = "Farhan Nugroho",
        email = "farhan@madebydap.com",
        image = R.drawable.guy
    ),
    ProfileData(
        id = 7,
        name = "Rizky Maulana",
        email = "rizky@madebydap.com",
        image = R.drawable.guy
    ),
    ProfileData(
        id = 8,
        name = "Ilham Akbar",
        email = "ilham@madebydap.com",
        image = R.drawable.guy
    ),
    ProfileData(
        id = 9,
        name = "Yoga Prasetya",
        email = "yoga@madebydap.com",
        image = R.drawable.guy
    ),
    ProfileData(
        id = 10,
        name = "Fajar Hidayat",
        email = "fajar@madebydap.com",
        image = R.drawable.guy
    )
)
