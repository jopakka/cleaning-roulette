package fi.joonasniemi.cleaningreoulette.core.data.repository.cleaningtasks

import fi.joonasniemi.cleaningreoulette.core.data.repository.model.asEntity
import fi.joonasniemi.cleaningreoulette.core.data.repository.model.asExternalModel
import fi.joonasniemi.cleaningroulette.core.database.dao.CleaningTasksDao
import fi.joonasniemi.cleaningroulette.core.database.model.CleaningTaskEntity
import fi.joonasniemi.cleaningroulette.core.model.data.CleaningTask
import kotlinx.coroutines.flow.map

internal class OfflineCleaningTasksRepository(
    private val cleaningTasksDao: CleaningTasksDao
) : CleaningTasksRepository {
    override fun getTasks() = cleaningTasksDao.getAllTasks()
        .map {
            it.map(CleaningTaskEntity::asExternalModel)
        }

    override suspend fun insertTask(task: CleaningTask) {
        cleaningTasksDao.insert(task.asEntity())
    }
}