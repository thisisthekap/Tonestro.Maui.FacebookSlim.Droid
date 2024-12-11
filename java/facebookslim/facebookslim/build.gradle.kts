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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

configurations {
    create("copyDependencies")
}

dependencies {

    implementation("com.facebook.android:facebook-android-sdk:17.0.2")

    "copyDependencies"("com.facebook.android:facebook-android-sdk:17.0.2")
}

project.afterEvaluate {
    tasks.register<Copy>("copyDeps") {
        from(configurations["copyDependencies"])
        into("${buildDir}/outputs/deps")
    }
    tasks.named("preBuild") { finalizedBy("copyDeps") }
}
