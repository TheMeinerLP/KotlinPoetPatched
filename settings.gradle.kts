
rootProject.name = "KotlinPoetPatched"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://files.minecraftforge.net/maven/")
    }
}

if (file("patched-kotlinpoet").exists()) {
    includeBuild("patched-kotlinpoet")
}
