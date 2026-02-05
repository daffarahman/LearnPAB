package com.madebydap.learnpab.profile.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.madebydap.learnpab.R
import com.madebydap.learnpab.profile.Profile

@Composable
fun ProfileCard(
    modifier: Modifier= Modifier,
    profile: Profile
) {
    Row(
        modifier = Modifier.padding(all = 16.dp)
    ) {
        Image(
            painter = painterResource(profile.image),
            contentDescription = "${profile.name}'s profile picture",
            modifier = Modifier
                .clip(CircleShape)
                .size(50.dp)
        )
        Spacer(
            modifier = Modifier.width(8.dp)
        )
        Column() {
            Text(
                text = profile.name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(
                modifier = Modifier.height(4.dp)
            )
            Text(
                text = profile.email
            )
        }
    }
}