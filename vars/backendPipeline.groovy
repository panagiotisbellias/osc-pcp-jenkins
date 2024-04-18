@Library('my-shared-library') _
import com.example.JenkinsJobCreator

pipeline {
    agent any
    stages {
        stage('Create Jobs') {
            steps {
                script {
                    // Create a pipeline job
                    def jobConfig = JenkinsJobCreator.createPipelineJob('MyPipelineJob', 'scripts/build.sh')
                    // Create the job in Jenkins
                    createJob('MyPipelineJob', jobConfig)
                }
            }
        }
    }
}

