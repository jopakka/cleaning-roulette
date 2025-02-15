package fi.joonasniemi.cleaningroulette.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import fi.joonasniemi.cleaningroulette.core.database.model.CleaningTaskEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CleaningTasksDao {
    @Query("SELECT * FROM cleaning_tasks")
    fun getAllTasks(): Flow<List<CleaningTaskEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(task: CleaningTaskEntity)
}