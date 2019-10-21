FROM openjdk:8-jdk-alpine
COPY ./target/config-service-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","config-service-0.0.1-SNAPSHOT.jar"]