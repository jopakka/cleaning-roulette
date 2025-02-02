package fi.joonasniemi.cleaningroulette.data.database

import fi.joonasniemi.cleaningroulette.data.database.model.AndroidCleaningTaskEntity
import fi.joonasniemi.cleaningroulette.data.database.model.CleaningTask
import fi.joonasniemi.cleaningroulette.data.database.model.toAndroidCleaningTaskEntity
import fi.joonasniemi.cleaningroulette.data.database.model.toCleaningTask
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map

class AndroidCleaningTasksDao(
    private val cleaningTasksDao: AndroidRoomCleaningTasksDao,
) : CleaningTasksDao {
    override fun getAll() = cleaningTasksDao.getAll()
        .distinctUntilChanged()
        .map { it.map(AndroidCleaningTaskEntity::toCleaningTask) }

    override suspend fun insert(task: CleaningTask) =
        cleaningTasksDao.insert(task.toAndroidCleaningTaskEntity())

    override suspend fun delete(task: CleaningTask) =
        cleaningTasksDao.delete(task.toAndroidCleaningTaskEntity())
}