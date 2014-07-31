package com.ngutzmann.plugins.artifactoryrest

import org.gradle.api.Plugin
import org.gradle.api.Project

public class ArtifactoryRestPlugin implements Plugin<Project> {

    /** 
     * @see org.gradle.api.Plugin#apply(java.lang.Object)
     */
     void apply(Project project){

        def artifactoryExtension = project.extensions.create 'artifactoryConfig', ArtifactoryExtension
     }
}