FROM openjdk:8-jdk-alpine
COPY ./target/user-service-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
#RUN sh -c 'touch user-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","user-service-0.0.1-SNAPSHOT.jar"]