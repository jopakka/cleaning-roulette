package fi.joonasniemi.cleaningroulette.di

import fi.joonasniemi.cleaningroulette.data.database.CleaningTasksRepository
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val sharedModule = module {
    singleOf(::CleaningTasksRepository)
}

expect val platformModule: Module