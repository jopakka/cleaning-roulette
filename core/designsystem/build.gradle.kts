plugins {
    alias(libs.plugins.cleaningroulette.android.library)
    alias(libs.plugins.cleaningroulette.android.library.compose)
}

android {
    namespace = "fi.joonasniemi.cleaningroulette.core.designsystem"
}

dependencies {
    api(libs.androidx.ui)
    api(libs.androidx.ui.graphics)
    api(libs.androidx.ui.tooling)
    api(libs.androidx.ui.tooling.preview)
    api(libs.androidx.material3)
}