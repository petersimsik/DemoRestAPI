

pipeline {
    agent 
    {
       label 'jenkins_agent'
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn build'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('deploy') {
            steps {
                sh 'mvn deploy'
            }
        }
    }
}

