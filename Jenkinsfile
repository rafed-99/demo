pipeline{
environment {
        registry = "rafedchraiti/testing"
        registryCredential = 'dckr_pat_wadd9m36GOJGduKhbJig6Pf458Q'
        dockerImage = ''
    }

    agent any
    stages{

           stage("Checkout git"){
                       steps{
                          echo 'Pulling...';
                          git branch: 'master',
                           url: 'https://github.com/rafed-99/demo';
                       }
                   }

        stage('MVN compile'){
            steps{
            sh 'mvn compile'
                  }
                                  }
        stage('MVN Code Quality'){
            steps{
            sh 'echo Sonarqube Code Quality Check Done'
            }
        }
        stage('MVN test'){
            steps{
            sh 'mvn test'
            }
        }
        stage('MVN package'){
            steps{
            sh 'mvn package'
            }
        }

        stage('Building our image') {
                    steps {
                        script {
                            dockerImage = docker.build registry + ":$BUILD_NUMBER"
                        }
                    }
                }

                stage('Deploy our image') {
                    steps {
                        script {
                            docker.withRegistry( '', registryCredential ) {
                            dockerImage.push()
                                    }
                        }
                    }
               }
                stage('Cleaning up') {
                    steps {
                        sh "docker rmi $registry:$BUILD_NUMBER"
                    }
                }

    }

}