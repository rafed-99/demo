pipeline{

    agent any
    stages{
        stage('Git'){
        git branch: master,
        url: 'https://github.com/rafed-99/demo'
        }
        stage('MVN clean & build'){
            sh 'mvn clean package'
        }
    }

}