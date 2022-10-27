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
        stage('MVN test'){
            steps{
            sh 'echo Sonarqube Code Quality Check Done'
            }
        }
        stage('MVN package'){
            steps{
            sh 'mvn package'
            }
        }

    }

}