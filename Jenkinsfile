pipeline {
    agent any
    stages {
        stage('Testing Environment') {
            steps {
            echo "Testing env"
                }
            }
        stage('Build') {
            steps {
                 echo "build"
                }
            }
        stage('Deploy') {
            steps {
                echo "deploy"
            }
        }
      stage('Production') {
	when {
		expression {
			env.BRANCH_NAME=='feature-documented'
		}
	}
            steps {
                echo "Sebs a plonker"
                sh 'mvn package -DskipTests'
                sh 'docker image build -t="shahe/sfia-skilllist:latest" .'
                sh 'docker push shahe/sfia-skilllist:latest'
            }
        }
    }
}