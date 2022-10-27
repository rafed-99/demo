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
            stage("MVN Clean"){
                steps{
                   sh 'mvn clean'
                }
            }
            stage("MVN Build"){
                steps{
                   sh 'mvn package'
                }
            }

}