package com.anvi.cineverse.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.anvi.cineverse.components.MovieCard
import com.anvi.cineverse.data.Movie

@Composable
fun HomeScreen(
    navController: NavController
) {

    var searchText by remember { mutableStateOf("") }

    val movies = listOf(

        Movie(
            "Avengers: Endgame",
            "🦸",
            "8.4/10",
            "Action • Adventure • Sci-Fi",
            "2019",
            "After the devastating events of Infinity War, the remaining Avengers unite for one final mission to reverse Thanos' snap and restore the universe."
        ),

        Movie(
            "Spider-Man: No Way Home",
            "🕷",
            "8.2/10",
            "Action • Adventure",
            "2021",
            "Spider-Man seeks Doctor Strange's help after his identity is revealed, leading to unexpected visitors from the multiverse."
        ),

        Movie(
            "The Batman",
            "🦇",
            "7.8/10",
            "Action • Crime",
            "2022",
            "Batman investigates a series of mysterious murders committed by the Riddler while uncovering corruption in Gotham."
        ),

        Movie(
            "Oppenheimer",
            "💣",
            "8.4/10",
            "Biography • Drama",
            "2023",
            "The story of J. Robert Oppenheimer and the creation of the atomic bomb during World War II."
        ),

        Movie(
            "Barbie",
            "🎀",
            "6.9/10",
            "Comedy • Fantasy",
            "2023",
            "Barbie begins questioning her perfect life and embarks on a journey into the real world."
        ),

        Movie(
            "Dune: Part Two",
            "🏜️",
            "8.5/10",
            "Sci-Fi • Adventure",
            "2024",
            "Paul Atreides joins the Fremen to seek revenge and fulfill his destiny."
        ),

        Movie(
            "Deadpool & Wolverine",
            "⚔️",
            "8.0/10",
            "Action • Comedy",
            "2024",
            "Deadpool teams up with Wolverine for an action-packed multiverse adventure."
        ),

        Movie(
            "Inside Out 2",
            "🧠",
            "7.9/10",
            "Animation • Family",
            "2024",
            "Riley enters her teenage years as new emotions arrive inside Headquarters."
        ),

        Movie(
            "Mission: Impossible – Dead Reckoning",
            "🕶️",
            "7.7/10",
            "Action • Thriller",
            "2023",
            "Ethan Hunt races against time to stop a dangerous AI weapon from falling into the wrong hands."
        ),

        Movie(
            "John Wick: Chapter 4",
            "🔫",
            "7.9/10",
            "Action • Crime",
            "2023",
            "John Wick faces his toughest enemies yet in a battle for freedom."
        )

    )

    val filteredMovies = movies.filter {
        it.title.contains(searchText, ignoreCase = true)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "🎬 CineVerse",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Trending Movies",
            fontSize = 20.sp,
            color = MaterialTheme.colorScheme.secondary
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = searchText,
            onValueChange = { searchText = it },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text("Search Movies")
            }
        )

        Spacer(modifier = Modifier.height(20.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            items(filteredMovies) { movie ->

                MovieCard(
                    title = movie.title,
                    emoji = movie.emoji,
                    onClick = {

                        navController.navigate(
                            "details/${movie.title}"
                        )

                    }
                )

            }

        }

    }

}