plugins {
    kotlin("jvm")
    java
    id("maven-publish")
}

coreProject()

dependencies {
    implementation("org.http4k:http4k-core:_")
    implementation("org.http4k:http4k-client-websocket:_")
    implementation("org.http4k:http4k-server-undertow:_")
    implementation("org.http4k:http4k-client-apache:_")

    implementation(project(":generic-api"))
    implementation(project(":ocpp-wamp"))
    implementation(project(":ocpp-websocket"))
    implementation(project(":ocpp-1-6-api-adapter"))
    implementation(project(":ocpp-1-6-core"))
    implementation(project(":ocpp-1-6-api"))
    implementation(project(":ocpp-2-0-api"))
    implementation(project(":ocpp-1-6-soap"))
    implementation(project(":ocpp-2-0-api-adapter"))
    implementation(project(":ocpp-2-0-core"))
    implementation(project(":ocpp-transport"))
    implementation(project(":operation-information"))

    testImplementation("org.mockito.kotlin:mockito-kotlin:_")
    testImplementation("org.mockito:mockito-inline:_")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()

            from(components["java"])
        }
    }
}