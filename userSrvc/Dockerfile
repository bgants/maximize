FROM openjdk:8-jdk-alpine
COPY ./target/userSrvc-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
#RUN sh -c 'touch userSrvc-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","userSrvc-0.0.1-SNAPSHOT.jar"]