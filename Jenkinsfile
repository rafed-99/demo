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

        stage('MVN clean & build'){
            steps{
            sh 'mvn clean package'
                  }
                                  }

    }

}