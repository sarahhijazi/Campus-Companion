package com.inci.campuscompanion.data.remote
import com.google.gson.annotations.SerializedName
data class EventDto(
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val location: String
)