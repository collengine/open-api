def repoName

pipeline {
    agent any

    stages {
        stage('Set Global Variables') {
            steps {
                script {
                    // Set the repository name globally
                    repoName = sh(script: 'basename `git rev-parse --show-toplevel`', returnStdout: true).trim()
                    // Print to verify
                    echo "Repository Name set to: ${repoName}"
                }
            }
        }
        
        // Example of using the global variable in another stage
        stage('Use Repository Name') {
            steps {
                script {
                    echo "Using repository name: ${repoName}"
                    // You can use repoName in other commands here
                }
            }
        }
        
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        
        stage('Project') {
            steps {
                getApiDocumentation "${repoName}"
            }
        }
    }
}
