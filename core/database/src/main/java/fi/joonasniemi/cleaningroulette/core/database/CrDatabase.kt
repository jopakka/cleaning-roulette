package fi.joonasniemi.cleaningroulette.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import fi.joonasniemi.cleaningroulette.core.database.dao.CleaningTasksDao
import fi.joonasniemi.cleaningroulette.core.database.model.CleaningTaskEntity


@Database(
    entities = [
        CleaningTaskEntity::class
    ],
    version = 1,
    exportSchema = true,
)
internal abstract class CrDatabase : RoomDatabase() {
    abstract fun cleaningTaskDao(): CleaningTasksDao
}