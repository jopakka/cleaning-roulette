package fi.joonasniemi.cleaningroulette.data.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cleaning_task")
data class AndroidCleaningTaskEntity(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val name: String,
)

fun AndroidCleaningTaskEntity.toCleaningTask() = CleaningTask(
    id = id,
    name = name,
)

fun CleaningTask.toAndroidCleaningTaskEntity() = AndroidCleaningTaskEntity(
    id = id,
    name = name,
)