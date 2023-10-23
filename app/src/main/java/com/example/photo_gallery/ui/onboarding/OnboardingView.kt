package com.example.photo_gallery.ui.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.photo_gallery.R


@Composable
fun OnboardingView() {

    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier.fillMaxSize(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.onboarding_img_bg),
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth,
            contentDescription = null,
        )
        Column (
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.app_logo), contentDescription = "app logo")
            Text(text = "Welcome to")
            Row {
                Text(text = "Photo")
                Text(text = "Gallery")
            }
            Text(text = "Smart Photo Organizer, easy, fast, and safe")
            Button(onClick = { /*TODO*/ }) {
                Text(text = "START NOW")
            }
            Row {
                Checkbox(checked = true, onCheckedChange = {})
                Text(text = "By continuing you agree to our TERMS and PRIVACY policies.")
            }
            Spacer(modifier = Modifier.height(20.dp))
            

        }
    }

}