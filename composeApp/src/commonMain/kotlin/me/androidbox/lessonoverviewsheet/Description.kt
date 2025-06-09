package me.androidbox.lessonoverviewsheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import lessonoverviewsheet.composeapp.generated.resources.Res
import lessonoverviewsheet.composeapp.generated.resources.arrow_right
import org.jetbrains.compose.resources.vectorResource

@Composable
fun Description(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(horizontal = 20.dp)
    ) {
        Text(
            text = "What you'll learn:",
            fontFamily = montserrat(),
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,
            lineHeight = 26.sp,
            color = primaryText)

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, Alignment.Start)
        ) {
            Icon(
                imageVector = vectorResource(resource = Res.drawable.arrow_right),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.alignBy(FirstBaseline).offset(y = 6.dp)
            )

            Text(
                modifier = Modifier.alignBy(FirstBaseline),
                text = "Understand Newtons's three laws of motion",
                fontFamily = montserrat(),
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                lineHeight = 26.sp,
                color = primaryText)
        }

        Spacer(modifier = Modifier.height(6.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, Alignment.Start)
        ) {
            Icon(
                imageVector = vectorResource(resource = Res.drawable.arrow_right),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.alignBy(FirstBaseline).offset(y = 6.dp)
            )

            Text(
                modifier = Modifier.alignBy(FirstBaseline),
                text = "Explain the principle of energy",
                fontFamily = montserrat(),
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                lineHeight = 26.sp,
                color = primaryText)
        }

        Spacer(modifier = Modifier.height(6.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, Alignment.Start)
        ) {
            Icon(
                imageVector = vectorResource(resource = Res.drawable.arrow_right),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.alignBy(FirstBaseline).offset(y = 6.dp)
            )

            Text(
                modifier = Modifier.alignBy(FirstBaseline),
                text = "Identify real-world examples of kinetic and potential energy",
                fontFamily = montserrat(),
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                lineHeight = 26.sp,
                color = primaryText)
        }

        Spacer(modifier = Modifier.height(6.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, Alignment.Start)
        ) {
            Icon(
                imageVector = vectorResource(resource = Res.drawable.arrow_right),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.alignBy(FirstBaseline).offset(y = 6.dp)
            )

            Text(
                modifier = Modifier.alignBy(FirstBaseline),
                text = "Solve simple physics problems involving force and mass",
                fontFamily = montserrat(),
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                lineHeight = 26.sp,
                color = primaryText)
        }

        Spacer(modifier = Modifier.height(6.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, Alignment.Start)
        ) {
            Icon(
                imageVector = vectorResource(resource = Res.drawable.arrow_right),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.alignBy(FirstBaseline).offset(y = 6.dp)
            )

            Text(
                modifier = Modifier.alignBy(FirstBaseline),
                text = "Apply concepts of momentum in everyday scenarios",
                fontFamily = montserrat(),
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                lineHeight = 26.sp,
                color = primaryText)
        }
    }
}