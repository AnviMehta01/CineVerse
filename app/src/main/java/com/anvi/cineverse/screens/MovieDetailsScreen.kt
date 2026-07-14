package com.anvi.cineverse.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.anvi.cineverse.data.Movie

@Composable
fun DetailScreen(
    navController: NavController,
    movieTitle: String
) {

    val movie = when (movieTitle) {

        "Avengers: Endgame" -> Movie(
            "Avengers: Endgame",
            "🦸",
            "8.4/10",
            "Action • Adventure • Sci-Fi",
            "2019",
            "The Avengers reunite for one final mission to reverse Thanos' snap and save the universe."
        )

        "Spider-Man: No Way Home" -> Movie(
            "Spider-Man: No Way Home",
            "🕷",
            "8.2/10",
            "Action • Adventure",
            "2021",
            "Peter Parker seeks Doctor Strange's help after his identity is revealed, opening the multiverse."
        )

        "The Batman" -> Movie(
            "The Batman",
            "🦇",
            "7.8/10",
            "Action • Crime",
            "2022",
            "Batman investigates the Riddler while uncovering corruption throughout Gotham."
        )

        "Oppenheimer" -> Movie(
            "Oppenheimer",
            "💣",
            "8.5/10",
            "Biography • Drama",
            "2023",
            "The story of J. Robert Oppenheimer and the creation of the atomic bomb."
        )

        "Barbie" -> Movie(
            "Barbie",
            "🎀",
            "7.0/10",
            "Comedy • Fantasy",
            "2023",
            "Barbie leaves Barbieland and discovers the real world."
        )

        "Dune: Part Two" -> Movie(
            "Dune: Part Two",
            "🏜️",
            "8.5/10",
            "Sci-Fi • Adventure",
            "2024",
            "Paul Atreides joins the Fremen to fight for the future of Arrakis."
        )

        "Deadpool & Wolverine" -> Movie(
            "Deadpool & Wolverine",
            "⚔️",
            "8.1/10",
            "Action • Comedy",
            "2024",
            "Deadpool teams up with Wolverine in a hilarious multiverse adventure."
        )

        "Inside Out 2" -> Movie(
            "Inside Out 2",
            "🧠",
            "7.9/10",
            "Animation • Family",
            "2024",
            "Riley enters her teenage years as new emotions arrive."
        )

        "Mission: Impossible – Dead Reckoning" -> Movie(
            "Mission: Impossible – Dead Reckoning",
            "🕶️",
            "7.7/10",
            "Action • Thriller",
            "2023",
            "Ethan Hunt races against time to stop a dangerous AI weapon."
        )

        "John Wick: Chapter 4" -> Movie(
            "John Wick: Chapter 4",
            "🔫",
            "8.0/10",
            "Action • Crime",
            "2023",
            "John Wick faces the High Table in his deadliest battle yet."
        )

        else -> Movie(
            "Unknown Movie",
            "🎬",
            "N/A",
            "Unknown",
            "-",
            "Movie details unavailable."
        )
    }

    var isFavourite by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = movie.emoji,
            fontSize = 90.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = movie.title,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "⭐ ${movie.rating}",
            fontSize = 22.sp,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = movie.genre,
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = movie.year,
            color = MaterialTheme.colorScheme.secondary
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = movie.description,
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                isFavourite = !isFavourite
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary
            )
        ) {
            Text(
                if (isFavourite)
                    "❤️ Remove from Favorites"
                else
                    "🤍 Add to Favorites"
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.popBackStack()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("⬅ Back")
        }

    }
}