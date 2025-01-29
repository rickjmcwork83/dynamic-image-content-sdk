package com.example.dynamicimagecontent

import kotlinx.serialization.Serializable

@Serializable
data class DisplayData(val imageURL: String, val text: String)
