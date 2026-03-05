pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {

        stage('Checkout Automation Repo') {
            steps {
                git branch: 'master', url: 'https://github.com/Akshay9522/Practice.git'
            }
        }

        stage('Run Automation') {
            steps {
                echo 'Running automation from Repo XYZ...'
                bat 'mvn clean test'
            }
        }

    }
}
