package com.madebydap.learnpab

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.madebydap.learnpab.profile.Profile
import com.madebydap.learnpab.profile.components.ProfileCard
import com.madebydap.learnpab.profile.profiles

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LinkedBrosApp() {
    val profileList = remember { profiles.toMutableList() }
    var textInput by remember { mutableStateOf("") }
    var selectedText by remember { mutableStateOf<String?>(null) }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(
                text = stringResource(R.string.app_name)
            ) })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            // List Area
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(profileList) { profile ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                            .clickable { selectedText = profile.name },
                        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                    ) {
                        ProfileCard(
                            profile = profile
                        )
                        Text(
                            text = "Ambasing",
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                }
            }
        }
    }

    // Popup Logic (AlertDialog)
    selectedText?.let { text ->
        AlertDialog(
            onDismissRequest = { selectedText = null },
            confirmButton = {
                TextButton(onClick = { selectedText = null }) {
                    Text("Tutup")
                }
            },
            title = { Text("Detail Item") },
            text = { Text("Anda mengklik: $text") }
        )
    }
}