package com.sameer.tm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform