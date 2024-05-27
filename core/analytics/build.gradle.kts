plugins {
    alias(libs.plugins.niyaj.android.library)
    alias(libs.plugins.niyaj.android.library.compose)
    alias(libs.plugins.niyaj.android.hilt)
}

android {
    namespace = "com.niyaj.core.analytics"
}

dependencies {
    implementation(libs.androidx.compose.runtime)

    prodImplementation(platform(libs.firebase.bom))
    prodImplementation(libs.firebase.analytics)
}
