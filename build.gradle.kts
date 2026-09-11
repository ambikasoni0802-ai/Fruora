plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android' // Agar Kotlin use kar rahe hain
}

android {
    namespace 'com.fruora.app' // Aapka package / namespace name
    compileSdk 34

    defaultConfig {
        applicationId "com.fruora.app"
        minSdk 21
        targetSdk 34
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_17
        targetCompatibility JavaVersion.VERSION_17
    }
}

dependencies {
    implementation 'androidx.core:core-ktx:1.12.0'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.11.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    
    // Razorpay Dependency
    implementation 'com.razorpay:checkout:1.6.33'
}
