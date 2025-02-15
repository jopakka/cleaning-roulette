package fi.joonasniemi.cleaningreoulette.core.data.repository.cleaningtasks

import fi.joonasniemi.cleaningroulette.core.model.data.CleaningTask
import kotlinx.coroutines.flow.Flow

interface CleaningTasksRepository {
    fun getTasks(): Flow<List<CleaningTask>>

    suspend fun insertTask(task: CleaningTask)
}