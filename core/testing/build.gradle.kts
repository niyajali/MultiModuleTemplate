plugins {
    alias(libs.plugins.niyaj.android.library)
    alias(libs.plugins.niyaj.android.library.compose)
    alias(libs.plugins.niyaj.android.hilt)
}

android {
    namespace = "com.niyaj.core.testing"
}

dependencies {
    api(kotlin("test"))
    api(libs.androidx.compose.ui.test)
    api(projects.core.analytics)
    api(projects.core.data)
    api(projects.core.model)
    api(projects.core.notification)

    debugApi(libs.androidx.compose.ui.testManifest)

    implementation(libs.androidx.test.rules)
    implementation(libs.hilt.android.testing)
    implementation(libs.kotlinx.coroutines.test)
    implementation(libs.kotlinx.datetime)
    implementation(projects.core.common)
    implementation(projects.core.designsystem)
}
