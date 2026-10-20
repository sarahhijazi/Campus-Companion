package com.inci.campuscompanion.data

import com.inci.campuscompanion.data.remote.CampusApi
import com.inci.campuscompanion.model.CampusEvent

class EventsRepository(
    private val api: CampusApi
) {
    suspend fun getEvents(): List<CampusEvent> {
        return api.getEvents().map { dto ->
            CampusEvent(
                id = dto.id,
                title = dto.title,
                description = dto.description,
                date = dto.date,
                location = dto.location
            )
        }
    }
}