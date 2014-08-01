package com.ngutzmann.plugins.artifactoryrest

import org.jfrog.artifactory.client.ArtifactoryClient
import org.gradle.api.tasks.TaskAction

class AddItemProperties extends ArtifactoryTask{

    String repository = null
    String group = null
    String name = null
    String version = null

    @TaskAction
    void setProperties() {
        ArtifactoryClient artifactoryClient = project.artifactoryClient

        artifactoryClient.repository().file()
    }
}