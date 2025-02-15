package di

import org.koin.dsl.module

val databaseDiModule = module {
    includes(databaseModule, daosModule)
}