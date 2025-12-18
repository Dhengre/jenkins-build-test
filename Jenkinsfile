pipeline {
    agent any

    // Use Maven configured in Jenkins
    tools {
        maven 'Maven3'
        jdk 'JDK17' // optional, if you have multiple JDKs
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // -B = batch mode, -q = quiet (reduces INFO logs)
                sh 'mvn -B -q clean compile'
            }
        }

        stage('Test') {
            steps {
                // Quiet mode, only errors/warnings
                sh 'mvn -B -q test'
                // Capture test results in Jenkins UI
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
    }
}
