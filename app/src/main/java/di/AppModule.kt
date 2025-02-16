package di

import fi.joonasniemi.cleaningroulette.MainActivityViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    includes(dataDiModule)
    viewModelOf(::MainActivityViewModel)
}