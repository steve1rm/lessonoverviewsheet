package me.androidbox.lessonoverviewsheet

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect fun isTablet(): Boolean