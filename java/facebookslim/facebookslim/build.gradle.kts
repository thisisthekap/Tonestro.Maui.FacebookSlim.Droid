plugins {
    id("com.android.library")
}

android {
    namespace = "com.tonestro.facebookslim"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
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
}

configurations {
    create("copyDependencies")
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.7.20")
    implementation("androidx.annotation:annotation:1.5.0")
    implementation("androidx.legacy:legacy-support-core-utils:1.0.0")
    implementation("com.android.installreferrer:installreferrer:1.0")
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.browser:browser:1.0.0")
    implementation("androidx.activity:activity:1.6.0")
    implementation("androidx.fragment:fragment:1.5.3")
    implementation("com.google.zxing:core:3.3.3")
    implementation("com.google.android.material:material:1.4.0")

    implementation("com.facebook.android:facebook-android-sdk:15.1.0")

    "copyDependencies"("com.facebook.android:facebook-android-sdk:15.1.0")
}

project.afterEvaluate {
    tasks.register<Copy>("copyDeps") {
        from(configurations["copyDependencies"])
        into("${buildDir}/outputs/deps")
    }
    tasks.named("preBuild") { finalizedBy("copyDeps") }
}
