package me.androidbox.lessonoverviewsheet

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import lessonoverviewsheet.composeapp.generated.resources.Res
import lessonoverviewsheet.composeapp.generated.resources.montserrat
import lessonoverviewsheet.composeapp.generated.resources.poltawski_nowy
import org.jetbrains.compose.resources.Font

@Composable
fun montserrat(): FontFamily {
    return FontFamily(
        Font(resource = Res.font.montserrat)
    )
}

@Composable
fun poltawskinowy(): FontFamily {
    return FontFamily(
        Font(resource = Res.font.poltawski_nowy)
    )
}