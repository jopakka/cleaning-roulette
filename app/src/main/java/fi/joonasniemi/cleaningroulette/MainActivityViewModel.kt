package fi.joonasniemi.cleaningroulette

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import fi.joonasniemi.cleaningreoulette.core.data.repository.cleaningtasks.CleaningTasksRepository
import fi.joonasniemi.cleaningroulette.core.model.data.CleaningTask
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class MainActivityViewModel(
    private val cleaningTasksRepository: CleaningTasksRepository,
) : ViewModel() {
    val tasks = cleaningTasksRepository.getTasks().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    fun insertTask(name: String, description: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                cleaningTasksRepository.insertTask(
                    CleaningTask(
                        id = "",
                        name = name,
                        description = description
                    )
                )
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}