package fi.joonasniemi.cleaningroulette

import android.app.Application
import fi.joonasniemi.cleaningroulette.di.initKoin
import org.koin.android.ext.koin.androidContext

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MainApplication)
            modules(appModule)
        }
    }
}