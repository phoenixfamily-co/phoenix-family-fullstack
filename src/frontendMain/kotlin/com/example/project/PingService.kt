package com.example.project

actual class PingService : IPingService {
    override suspend fun ping(message: String): String {
        return ""
    }
}