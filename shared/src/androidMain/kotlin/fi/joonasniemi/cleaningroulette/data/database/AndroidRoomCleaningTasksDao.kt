package fi.joonasniemi.cleaningroulette.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import fi.joonasniemi.cleaningroulette.data.database.model.AndroidCleaningTaskEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AndroidRoomCleaningTasksDao {
    @Query("SELECT * FROM cleaning_task")
    fun getAll(): Flow<List<AndroidCleaningTaskEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(task: AndroidCleaningTaskEntity): Long

    @Delete
    suspend fun delete(task: AndroidCleaningTaskEntity)
}