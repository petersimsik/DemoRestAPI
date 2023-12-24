

pipeline {
    agent 
    {
        docker {
            label: 'jenkins_agent'
        }   
    }
    stages {
        stage('hello') {
            steps {
                sh 'echo Hello Jenkins!'
            }
        }
    }
}

