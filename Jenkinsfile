
pipeline {
    
	agent any
	tools {
		gradle 'DefaultGradle'
		jdk 'Java1.8.0'
	}
	stages {
		stage('Build') {
			steps {
				sh 'gradle build'
			}
		}	
	}
}
