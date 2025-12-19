pipeline {
    agent any
    
    tools {
		maven 'maven-3'
	}
	
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Dhengre/jenkins-build-test.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
    }
    pipeline {
    agent {
        docker {
            image 'maven:3.9.11-eclipse-temurin-17'
            args '-v $HOME/.m2:/root/.m2'
        }
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn -q clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
        success {
            echo '✅ Tests passed in Docker'
        }
        failure {
            echo '❌ Tests failed'
        }
    }
}

}
