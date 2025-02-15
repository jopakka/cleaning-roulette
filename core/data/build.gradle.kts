plugins {
    alias(libs.plugins.cleaningroulette.android.library)
    alias(libs.plugins.cleaningroulette.android.koin)
}

android {
    namespace = "fi.joonasniemi.cleaningreoulette.core.data"
}

dependencies {
    implementation(projects.core.database)
    implementation(projects.core.model)
}