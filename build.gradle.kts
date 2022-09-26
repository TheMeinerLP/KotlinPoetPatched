

plugins {
    id("net.minecrell.gitpatcher") version "0.9.0"
}

group = "dev.themeinerlp"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

patches {
    submodule = "upstream"

    target = file("target")

    patches = file("patches")
}