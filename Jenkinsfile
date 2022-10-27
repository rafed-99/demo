pipeline{

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

        stage('Deploy'){
            sh 'build build -t devopsproject.jar .'
        }

    }

}