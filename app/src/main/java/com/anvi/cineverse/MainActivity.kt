package com.anvi.cineverse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.anvi.cineverse.navigation.CineVerseNavigation
import com.anvi.cineverse.ui.theme.CineVerseTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            CineVerseTheme {
                CineVerseApp()
            }
        }
    }
}

@Composable
fun CineVerseApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        CineVerseNavigation()
    }
}

@Preview(showBackground = true)
@Composable
fun CineVersePreview() {
    CineVerseTheme {
        CineVerseApp()
    }
}