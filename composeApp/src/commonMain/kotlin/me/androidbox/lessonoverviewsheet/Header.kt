package me.androidbox.lessonoverviewsheet

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import lessonoverviewsheet.composeapp.generated.resources.Res
import lessonoverviewsheet.composeapp.generated.resources.clock
import lessonoverviewsheet.composeapp.generated.resources.intermediate
import org.jetbrains.compose.resources.vectorResource

@Composable
fun Header(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
    ) {
        Text(
            text = "Physics Crash Course",
            fontFamily = poltawskinowy(),
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            lineHeight = 40.sp
        )

        Text(
            text = "The Physics Crash Course offers a foundational overview of essential concepts, teaching learners to understand Newton’s three laws of motion, explain the principle of energy conservation, distinguish between kinetic and potential energy with real-world examples, solve basic problems involving force and mass, and apply the concept of momentum in everyday situations.",
            fontFamily = montserrat(),
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            TopicPill(
                text = "Intermediate",
                textColor = primaryText,
                backgroundColor = purplePillBg,
                icon = {
                    Icon(
                        imageVector = vectorResource(resource = Res.drawable.intermediate),
                        contentDescription = null,
                        tint = Color.Unspecified
                    )
                }
            )

            TopicPill(
                text = "Science",
                textColor = greenPillText,
                backgroundColor = greenPillBg
            )

            TopicPill(
                text = "Physics",
                textColor = greenPillText,
                backgroundColor = greenPillBg
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        TopicPill(
            modifier = Modifier.border(width = 1.dp, color = stroke, shape = CircleShape),
            text = "15 mins",
            textColor = secondaryText,
            backgroundColor = Color.Transparent,
            icon = {
                Icon(
                    imageVector = vectorResource(resource = Res.drawable.clock),
                    contentDescription = null,
                    tint = Color.Unspecified
                )
            }
        )
    }
}