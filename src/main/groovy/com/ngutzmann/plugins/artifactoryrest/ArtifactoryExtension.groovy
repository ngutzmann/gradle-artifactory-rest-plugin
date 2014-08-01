package com.ngutzmann.plugins.artifactoryrest

class ArtifactoryExtension {

    String url = null
    String username = null
    String password = null

    void url(String url){
        this.url = url
    }

    void username(String username){
        this.username = username
    }

    void password(String password){
        this.password = password
    }
}