plugins {
    alias(libs.plugins.niyaj.android.library)
    alias(libs.plugins.niyaj.android.hilt)
}

android {
    namespace = "com.niyaj.core.datastore.test"
}

dependencies {
    implementation(libs.hilt.android.testing)
    implementation(projects.core.common)
    implementation(projects.core.datastore)
}
