FROM openjdk:8-jdk-alpine
COPY ./target/discovery-service-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","discovery-service-0.0.1-SNAPSHOT.jar"]