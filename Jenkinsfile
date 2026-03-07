pipeline {
    agent any

    triggers {
        githubPush()
        cron('H/5 * * * *')
    }

    stages {

        stage('Checkout Automation Repo') {
            steps {
                git branch: 'master', url: 'https://github.com/Akshay9522/Practice.git'
            }
        }

        stage('Run Smoke Tests') {
            steps {
                echo 'Running Smoke Tests...'
                bat 'mvn test -DsuiteXmlFile=smoke_testng.xml'
            }
        }

        stage('Run Regression Tests Every 5 Minutes') {
            steps {
                echo 'Running Regression Tests...'
                bat 'mvn test -DsuiteXmlFile=regression_testng.xml'
            }
        }

    }
}
