package com.example

def createPipelineJob(String jobName, String scriptPath) {
    return """
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    script {
                        // Fetch source code from SCM
                        git 'https://github.com/panagiotisbellias/pcp-backend.git'
                        // Execute pipeline script
                        #sh "sh ${scriptPath}"
			sh "ls -la"
                    }
                }
            }
        }
    }
    """
}

