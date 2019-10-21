FROM openjdk:8-jdk-alpine
COPY ./target/discoverySrvc-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","discoverySrvc-0.0.1-SNAPSHOT.jar"]