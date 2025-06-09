@file:OptIn(ExperimentalMaterial3WindowSizeClassApi::class)

package me.androidbox.lessonoverviewsheet

import android.content.res.Configuration
import android.content.res.Resources
import android.os.Build
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()

actual fun isTablet(): Boolean {
    val configuration = Resources.getSystem().configuration

    return (configuration.screenLayout and Configuration.SCREENLAYOUT_SIZE_MASK) >=
            Configuration.SCREENLAYOUT_SIZE_LARGE
}