
plugins {
    alias(libs.plugins.niyaj.android.library)
    alias(libs.plugins.niyaj.android.library.jacoco)
    alias(libs.plugins.niyaj.android.hilt)
    alias(libs.plugins.niyaj.android.room)
}

android {
    defaultConfig {
        testInstrumentationRunner =
            "com.niyaj.core.testing.CustomTestRunner"
    }
    namespace = "com.niyaj.core.database"
}

dependencies {
    api(projects.core.model)

    implementation(libs.kotlinx.datetime)

    androidTestImplementation(projects.core.testing)
}
