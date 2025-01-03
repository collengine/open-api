pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Project') {
            steps {
                getApiDocumentation 'open-api-v1'
            }
        }
    }
}
