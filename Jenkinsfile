pipeline {
    agent any

    triggers {
        githubPush()        // Run when developer commits
        cron('0 19 * * *')  // Run regression daily at 7 PM
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
                triggeredBy 'SCMTrigger'
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
                echo 'Running Regression Tests (7 PM Schedule)...'
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
