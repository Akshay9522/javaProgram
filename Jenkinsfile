pipeline {
    agent any

    triggers {
        githubPush()        // Run smoke when developer commits
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
            steps {
                echo 'Running Smoke Tests...'
                bat 'mvn clean test -DsuiteXmlFile=SmokeTestng.xml'
            }
        }

        stage('Run Regression Tests') {
            steps {
                echo 'Running Regression Tests...'
                bat 'mvn test -DsuiteXmlFile=RegressionTestng.xml'
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
