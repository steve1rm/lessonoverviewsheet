package me.androidbox.lessonoverviewsheet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import lessonoverviewsheet.composeapp.generated.resources.Res
import lessonoverviewsheet.composeapp.generated.resources.tag
import lessonoverviewsheet.composeapp.generated.resources.teacher
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.vectorResource

@Composable
fun TeacherPill(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.height(56.dp),
        shape = RoundedCornerShape(100),
        color = teacherPillBg
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
           Image(
                modifier = Modifier
                    .padding(4.dp)
                    .size(40.dp),
                painter = painterResource(resource = Res.drawable.teacher),
                contentDescription = null,
            )

            Spacer(modifier = Modifier.width(width = 16.dp))

            Text(
                text = "Dr. Eleanor Maxwell",
                fontFamily = montserrat(),
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp,
                lineHeight = 26.sp,
                color = primaryText
            )
        }
    }
}