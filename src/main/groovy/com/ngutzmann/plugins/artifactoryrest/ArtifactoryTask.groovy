package com.ngutzmann.plugins.artifactoryrest

abstract class ArtifactoryTask extends DefaultTask {

    ArtifactoryExtension extension

    protected ArtifactoryTask(ArtifactoryExtension extension){
        this.extension = extension
    }

}