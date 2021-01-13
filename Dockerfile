FROM openjdk:latest
ADD target/employee-h2-docker-plugin.jar employee-h2-docker-plugin.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","employee-h2-docker-plugin.jar"]
