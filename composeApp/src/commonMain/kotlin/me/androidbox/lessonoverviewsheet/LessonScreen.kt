package me.androidbox.lessonoverviewsheet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun LessonScreen(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier
        .fillMaxSize()) {

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = cardBg,
                    shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
                )
                .padding(top = 28.dp)
        ) {

            Header()

            Spacer(modifier = Modifier.height(16.dp))

            HorizontalDivider(modifier = Modifier.fillMaxWidth(),
                thickness = 1.dp)

            Spacer(modifier = Modifier.height(8.dp))

            Description()

            Spacer(modifier = Modifier.weight(1f))

            TeacherPill()

            Spacer(modifier = Modifier.height(6.dp))
        }
    }
}

@Preview
@Composable
fun LessonScreenPreview() {
    MaterialTheme {
        LessonScreen()
    }
}