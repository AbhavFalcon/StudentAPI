FROM openjdk:17
EXPOSE 8082
ARG JAR_FILE=target/*.jar
COPY ./target/spring-boot-docker.jar .
ENTRYPOINT ["java","-jar","./spring-boot-docker.jar"]