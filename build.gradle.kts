plugins {
    id("scala")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "ru.rachie"
version = "1.0.0"

scala {
    version = "3.2.2"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.2.2")
}

tasks.withType<ScalaCompile> {
    options.encoding = "UTF-8"

    sourceCompatibility = "19"
    targetCompatibility = "19"
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "ru.rachie.Main"
    }

    archiveFileName.set("${project.name}.jar")
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}

tasks.shadowJar {
    archiveFileName.set("${project.name}Shadow.jar")

    isEnableRelocation = true
    relocationPrefix = "shadow"

    minimize()
}