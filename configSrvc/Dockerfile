FROM openjdk:8-jdk-alpine
COPY ./target/configSrvc-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","configSrvc-0.0.1-SNAPSHOT.jar"]