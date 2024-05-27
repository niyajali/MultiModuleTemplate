plugins {
    alias(libs.plugins.niyaj.android.library)
    alias(libs.plugins.niyaj.android.library.compose)
    alias(libs.plugins.niyaj.android.library.jacoco)
}

android {
    namespace = "com.niyaj.core.ui"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {

    api(libs.androidx.metrics)
    api(projects.core.analytics)
    api(projects.core.designsystem)
    api(projects.core.model)

    implementation(libs.androidx.browser)
    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)

    androidTestImplementation(projects.core.testing)
}