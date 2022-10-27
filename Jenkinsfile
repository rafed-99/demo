pipeline{

    agent any
    stages{


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