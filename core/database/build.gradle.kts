plugins {
    alias(libs.plugins.cleaningroulette.android.library)
    alias(libs.plugins.cleaningroulette.android.room)
    alias(libs.plugins.cleaningroulette.android.koin)
}

android {
    namespace = "fi.joonasniemi.cleaningroulette.core.database"
}

dependencies {
}