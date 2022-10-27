FROM openjdk:8
EXPOSE 8088
ADD target/devopsproject.jar devopsproject.jar
ENTRYPOINT ["java","-jar","/devopsproject.jar"]