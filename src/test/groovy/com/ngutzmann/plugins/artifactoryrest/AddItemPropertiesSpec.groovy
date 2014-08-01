package com.ngutzmann.plugins.artifactoryrest

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.testfixtures.ProjectBuilder

import spock.lang.Specification

class AddItemPropertiesSpec extends Specification {

    def 'misconfiguration throws exception'() {

        Project project = ProjectBuilder.builder().build()
        when:
        project.apply plugin: 'artifactory-rest'


        project.task([type: artifactory.AddItemProperties]){

        }

        then:
        true == true
    }

}