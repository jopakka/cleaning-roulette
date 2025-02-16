package fi.joonasniemi.cleaningroulette

import com.android.build.api.variant.LibraryAndroidComponentsExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import kotlin.io.resolve
import kotlin.text.get

/**
 * Disable unnecessary Android instrumented tests for the [project] if there is no `androidTest` folder.
 * Otherwise, these projects would be compiled, packaged, installed and ran only to end-up with the following message:
 *
 * > Starting 0 tests on AVD
 *
 * Note: this could be improved by checking other potential sourceSets based on buildTypes and flavors.
 */
internal fun LibraryAndroidComponentsExtension.disableUnnecessaryAndroidTests(
    project: Project,
) = beforeVariants {
    it.androidTest.enable = it.androidTest.enable
            && project.projectDir.resolve("src/androidTest").exists()
}

internal fun Project.configureAndroidTests() {
    dependencies {
        val kotlinTest = libs.findLibrary("kotlin-test").get()

        add("androidTestImplementation", kotlinTest)
        add("testImplementation", kotlinTest)

        add("androidTestImplementation", libs.findLibrary("androidx-junit").get())
        add("androidTestImplementation", libs.findLibrary("androidx-test-runner").get())
    }
}