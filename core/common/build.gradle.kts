plugins {
    alias(libs.plugins.niyaj.android.library)
    alias(libs.plugins.niyaj.android.library.jacoco)
    alias(libs.plugins.niyaj.android.hilt)
}

android {
    namespace = "com.niyaj.core.common"
}

dependencies {
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.turbine)
}