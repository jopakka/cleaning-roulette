package fi.joonasniemi.cleaningroulette.data.database

import fi.joonasniemi.cleaningroulette.data.database.model.CleaningTask
import kotlinx.coroutines.flow.Flow

class CleaningTasksRepository(
    private val cleaningTasksDao: CleaningTasksDao,
) {
    fun getAll(): Flow<List<CleaningTask>> = cleaningTasksDao.getAll()
}