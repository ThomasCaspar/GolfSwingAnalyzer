package com.golfswing.analyzer.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val TrajectoryRed = Color(0xFFE30613)
val AccentGreen = Color(0xFF2ECC71)
val SurfaceDark = Color(0xFF121212)

private val DarkColors = darkColorScheme(
    primary = AccentGreen,
    secondary = TrajectoryRed,
    background = SurfaceDark,
    surface = SurfaceDark
)

@Composable
fun GolfSwingTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColors,
        content = content
    )
}
