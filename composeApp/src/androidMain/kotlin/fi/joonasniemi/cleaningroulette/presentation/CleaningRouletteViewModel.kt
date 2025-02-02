package fi.joonasniemi.cleaningroulette.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import fi.joonasniemi.cleaningroulette.data.database.CleaningTasksRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn

class CleaningRouletteViewModel(
    private val cleaningTasksRepository: CleaningTasksRepository,
) : ViewModel() {
    val tasks = cleaningTasksRepository.getAll().stateIn(
        viewModelScope,
        SharingStarted.Eagerly,
        emptyList()
    )
}