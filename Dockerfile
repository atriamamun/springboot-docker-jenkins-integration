FROM alpine:3.10 as AlpineImage
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/docker-compose-spring-1.0.jar
COPY ${JAR_FILE} docker-compose-spring-1.0.jar
ENTRYPOINT ["java","-jar","/docker-compose-spring-1.0.jar"]
EXPOSE 8085