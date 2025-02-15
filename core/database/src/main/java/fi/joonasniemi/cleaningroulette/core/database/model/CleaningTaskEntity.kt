package fi.joonasniemi.cleaningroulette.core.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("cleaning_tasks")
data class CleaningTaskEntity(
    @PrimaryKey val id: String,
    val name: String,
    val description: String,
)
