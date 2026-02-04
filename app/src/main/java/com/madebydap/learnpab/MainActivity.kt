package com.madebydap.learnpab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import com.madebydap.learnpab.ui.theme.LearnPABTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnPABTheme {
                RegistrationForm()
            }
        }
    }
}

@Composable
fun RegistrationForm() {
    var name = remember {
        mutableStateOf("")
    }
    var showDialog = remember {
        mutableStateOf(false)
    }
    Image(
        painter = painterResource(R.drawable.androidparty),
        contentScale = ContentScale.Crop,
        contentDescription = "Android Party"
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Surface (
            color = Color.Blue,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Birthday Present Form",
                color = Color.White
            )
        }
        // First form
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Name: "
            )
            OutlinedTextField(
                value = name.value,
                onValueChange = { text ->
                    name.value = text
                }
            )
        }
        Button (
            onClick = {
                showDialog.value = true
            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Submit!")
        }

        if (showDialog.value) {
            Popup(
                alignment = Alignment.Center,
                onDismissRequest = {
                    showDialog.value = false
                }
            ) {
                Column {
                    Text(name.value)
                    Button(
                        onClick = {
                            showDialog.value = false
                        }
                    ) {
                        Text("Ok!")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LearnPABPreview() {
    LearnPABTheme {
        RegistrationForm()
    }
}