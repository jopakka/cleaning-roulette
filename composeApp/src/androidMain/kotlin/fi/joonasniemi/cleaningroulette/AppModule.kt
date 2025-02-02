package fi.joonasniemi.cleaningroulette

import fi.joonasniemi.cleaningroulette.presentation.CleaningRouletteViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::CleaningRouletteViewModel)
}
