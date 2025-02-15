package fi.joonasniemi.cleaningreoulette.core.data.repository.model

import fi.joonasniemi.cleaningroulette.core.database.model.CleaningTaskEntity
import fi.joonasniemi.cleaningroulette.core.model.data.CleaningTask

fun CleaningTask.asEntity() = CleaningTaskEntity(
    id = id,
    name = name,
    description = description,
)

fun CleaningTaskEntity.asExternalModel() = CleaningTask(
    id = id,
    name = name,
    description = description,
)
