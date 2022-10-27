pipeline{

    agent any
    stages{

           stage('GIT'){
                git branch: 'master',
                url: 'https://github.com/rafed-99/demo'
           }

        stage('MVN clean & build'){
            steps{
            sh 'mvn clean package'
                  }
                                  }

    }

}