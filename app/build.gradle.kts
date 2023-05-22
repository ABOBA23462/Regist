plugins {
    id("com.android.application")
    kotlin("android")

// Kapt
    kotlin("kapt")

// Hilt
    id("com.google.dagger.hilt.android")

// Save args
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.regist"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.kitsugit"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
// ViewBinding
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.fragment:fragment-ktx:1.5.7")
// Core
    implementation("androidx.core:core-ktx:1.10.0")

// AppCompat
    implementation("androidx.appcompat:appcompat:1.6.1")

// Material Design
    implementation("com.google.android.material:material:1.9.0")

// UI Components
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

// Architecture Components
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    // Navigation
    val navVersion = "2.5.3"
    // implementation
    implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navVersion")

    // Hilt
    val hilt_version = "2.45"
    implementation("com.google.dagger:hilt-android:$hilt_version")
    kapt("com.google.dagger:hilt-compiler:$hilt_version")

    // ViewBindingPropertyDelegate
    val view_binding_property_delegate = "1.5.3"
    // To use only without reflection variants of viewBinding
    //noinspection GradleDependency
    implementation("com.github.kirich1409:viewbindingpropertydelegate-noreflection:$view_binding_property_delegate")
}