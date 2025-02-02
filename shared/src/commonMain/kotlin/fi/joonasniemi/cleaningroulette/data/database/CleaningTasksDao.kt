package fi.joonasniemi.cleaningroulette.data.database

import fi.joonasniemi.cleaningroulette.data.database.model.CleaningTask
import kotlinx.coroutines.flow.Flow

interface CleaningTasksDao {
    fun getAll(): Flow<List<CleaningTask>>
    suspend fun insert(task: CleaningTask): Long
    suspend fun delete(task: CleaningTask)
}