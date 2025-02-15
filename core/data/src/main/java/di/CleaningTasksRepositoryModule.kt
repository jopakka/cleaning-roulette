package di

import fi.joonasniemi.cleaningreoulette.core.data.repository.cleaningtasks.CleaningTasksRepository
import fi.joonasniemi.cleaningreoulette.core.data.repository.cleaningtasks.OfflineCleaningTasksRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

internal val cleaningTasksRepositoryModule = module {
    singleOf(::OfflineCleaningTasksRepository) {
        bind<CleaningTasksRepository>()
    }
}