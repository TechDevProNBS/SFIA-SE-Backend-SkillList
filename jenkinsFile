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
            }
        }
}
}