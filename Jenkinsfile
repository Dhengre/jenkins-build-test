pipeline {
    agent any

    parameters {
        choice(name: 'TEST_TYPE', choices: ['ALL', 'UI', 'API'])
        string(name: 'THREAD_COUNT', defaultValue: '4')
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Docker Test Run') {
            steps {
                sh 'docker-compose up --build'
            }
        }
    }

    post {
        always {
            sh 'docker-compose down'
            allure results: [[path: 'target/allure-results']]
        }
    }
}
