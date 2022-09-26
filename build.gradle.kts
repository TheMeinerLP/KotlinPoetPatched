import net.minecrell.gitpatcher.PatchExtension

plugins {
    id("net.minecraftforge.gitpatcher") version "0.10.+"
}

group = "dev.themeinerlp"
version = "1.0.0-SNAPSHOT"

configure<PatchExtension> {
    submodule = "kotlinpoet"
    patches = file("patches")
    target = file("patched-kotlinpoet")
}

tasks.register("rebuildPatches") {
    dependsOn(tasks.makePatches)
}