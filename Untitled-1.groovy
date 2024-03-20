
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code from GitHub'
                git 'https://github.com/Gowrishankar799/seleniumTest.git'
            }
        }
        stage('Run Selenium Tests') {
            steps {
                echo 'Running Selenium tests'
                sh 'mvn clean test'
            }
        }
    }
}
