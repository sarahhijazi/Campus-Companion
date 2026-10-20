
package com.inci.campuscompanion.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.inci.campuscompanion.data.EventsRepository
import com.inci.campuscompanion.data.remote.RetrofitClient

class EventsViewModelFactory : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(EventsViewModel::class.java)) {
            val repository = EventsRepository(RetrofitClient.api)

            @Suppress("UNCHECKED_CAST")
            return EventsViewModel(repository) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
