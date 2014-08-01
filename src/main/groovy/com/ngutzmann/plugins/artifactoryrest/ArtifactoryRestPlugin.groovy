package com.ngutzmann.plugins.artifactoryrest

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.GradleException

import org.jfrog.artifactory.client.ArtifactoryClient

public class ArtifactoryRestPlugin implements Plugin<Project> {

    /** 
     * @see org.gradle.api.Plugin#apply(java.lang.Object)
     */
     void apply(Project project){

        def artifactoryExtension = project.extensions.create 'artifactoryConfig', ArtifactoryExtension

        project.ext.artifactory.AddItemProperties = AddItemProperties.class

        project.afterEvaluate{
            // The only required extension object is the URL, not all of the actions require authentication
            if (artifactoryExtension.url == null )
            {
                throw new GradleException("The artifactory url must be defined")
            }

            def artifactoryClient = ArtifactoryClient.create(artifactoryExtension.url, artifactoryExtension.username, artifactoryExtension.password)
            project.extensions.add 'artifactoryClient', artifactoryClient
        }



     }
}