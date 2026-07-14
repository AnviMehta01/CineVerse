package com.anvi.cineverse.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar() {

    var search by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = search,
        onValueChange = {
            search = it
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        label = {
            Text("Search movies...")
        },
        singleLine = true
    )
}