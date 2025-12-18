pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Dhengre/jenkins-build-test.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn -q test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
