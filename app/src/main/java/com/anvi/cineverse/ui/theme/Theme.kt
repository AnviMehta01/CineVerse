package com.anvi.cineverse.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val CineVerseColorScheme = darkColorScheme(

    primary = CosmicPurple,
    secondary = PixBlue,
    tertiary = GoldenGlow,

    background = MidnightBlue,
    surface = SurfaceDark,

    onPrimary = SoftWhite,
    onSecondary = SoftWhite,
    onTertiary = MidnightBlue,

    onBackground = SoftWhite,
    onSurface = SoftWhite,

    error = ErrorRed
)

@Composable
fun CineVerseTheme(
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colorScheme = CineVerseColorScheme,
        typography = Typography,
        content = content
    )

}