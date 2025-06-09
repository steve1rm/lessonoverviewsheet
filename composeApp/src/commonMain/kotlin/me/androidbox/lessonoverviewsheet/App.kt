package me.androidbox.lessonoverviewsheet

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun App() {
    MaterialTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = background) { paddingValues ->

            LessonScreen(
                modifier = Modifier.padding(paddingValues)
            )
        }
    }
}


@Preview
@Composable
fun AppPreview() {
    MaterialTheme {
        App()
    }
}