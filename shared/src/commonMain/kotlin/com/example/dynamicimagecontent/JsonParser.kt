package com.example.dynamicimagecontent

import kotlinx.serialization.json.Json
import kotlinx.serialization.decodeFromString

object JsonParser {
    fun parse(jsonString: String): DisplayData {
        return Json.decodeFromString(jsonString)
    }
}