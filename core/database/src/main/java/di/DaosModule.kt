package di

import fi.joonasniemi.cleaningroulette.core.database.CrDatabase
import fi.joonasniemi.cleaningroulette.core.database.dao.CleaningTasksDao
import org.koin.dsl.module

internal val daosModule = module {
    single<CleaningTasksDao> { get<CrDatabase>().cleaningTaskDao() }
}