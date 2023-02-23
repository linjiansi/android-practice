plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

@Suppress("UnstableApiUsage")
android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.android_practice"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }

    packagingOptions {
        resources {
            excludes += "META-INF/gradle/incremental.annotation.processors"
        }
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidxCoreKtx)
    implementation(libs.androidxNavigationFragment)
    implementation(libs.androidxNavigationUiKtx)
    implementation(libs.androidxAppCompat)
    implementation(libs.androidxDatastorePreferences)
    implementation(libs.androidxConstraintlayout)

    implementation(libs.kotlinxCoroutinesCore)
    implementation(libs.kotlinxCoroutinesAndroid)
    implementation(libs.material)
    implementation(libs.okHttpCore)
    implementation(libs.okHttpLoggingInterceptor)
    implementation(libs.daggerHiltAndroid)
    implementation(libs.daggerHiltAndroidCompiler)
    implementation(libs.glideCore)
    kapt(libs.glideCompiler)
    implementation(libs.groupieCore)
    implementation(libs.groupieViewBinding)
}

kapt {
    correctErrorTypes = true
}
