package fi.joonasniemi.cleaningroulette.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import fi.joonasniemi.cleaningroulette.data.database.model.AndroidCleaningTaskEntity

@Database(
    entities = [AndroidCleaningTaskEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AndroidCleaningRouletteDatabase : RoomDatabase() {
    abstract fun getCleaningTasksDao(): AndroidRoomCleaningTasksDao
}