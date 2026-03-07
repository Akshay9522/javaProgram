pipeline {
    agent any

    triggers {
        githubPush()
        cron('H/8 * * * *')   // Run regression every 8 minutes
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

        stage('Verify Maven') {
            steps {
                bat 'mvn -version'
            }
        }

        stage('Run Smoke Tests') {
            when {
                not { triggeredBy 'TimerTrigger' }
            }
            steps {
                echo 'Running Smoke Tests (Developer Commit)...'

                bat """
                mvn clean test ^
                -DsuiteXmlFile=smoke_testng.xml ^
                -Denv=dev
                """
            }
        }

        stage('Run Regression Tests') {
            when {
                triggeredBy 'TimerTrigger'
            }
            steps {
                echo 'Running Regression Tests (Every 8 Minutes)...'

                bat """
                mvn clean test ^
                -DsuiteXmlFile=regression_testng.xml ^
                -Denv=qa
                """
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
Environment: ${ENV}
Status: ${currentBuild.currentResult}

Build URL:
${env.BUILD_URL}
""",
                to: "akshay.shinde9522@gmail.com",
                attachmentsPattern: '**/target/surefire-reports/*.xml'
            )
        }
    }
}
