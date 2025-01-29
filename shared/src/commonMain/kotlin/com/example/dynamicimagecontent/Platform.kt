package com.example.dynamicimagecontent

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform