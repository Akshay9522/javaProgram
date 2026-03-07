pipeline {
    agent any

    triggers {
        githubPush()
        cron('0 19 * * *')   // 7 PM Regression
    }

    stages {

        stage('Clean Workspace') {
            steps {
                cleanWs()
            }
        }

        stage('Checkout Automation Repo') {
            steps {
                git branch: 'master', url: 'https://github.com/Akshay9522/Practice.git'
            }
        }

        stage('Run Smoke Tests') {
            when {
                not { triggeredBy 'TimerTrigger' }
            }
            steps {
                echo 'Running Smoke Tests (Developer Commit)...'
                bat 'mvn clean test -DsuiteXmlFile=smoke_testng.xml'
            }
        }

        stage('Run Regression Tests') {
            when {
                triggeredBy 'TimerTrigger'
            }
            steps {
                echo 'Running Regression Tests (Scheduled 7 PM)...'
                bat 'mvn clean test -DsuiteXmlFile=regression_testng.xml'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'

            emailext(
                subject: "Automation Execution Result: ${currentBuild.currentResult}",
                body: """
Automation Test Execution Completed

Job Name: ${env.JOB_NAME}
Build Number: ${env.BUILD_NUMBER}
Status: ${currentBuild.currentResult}

Report:
${env.BUILD_URL}
""",
                to: "akshay.shinde9522@gmail.com",
                attachmentsPattern: '**/target/surefire-reports/*.xml'
            )
        }
    }
}
