FROM openjdk:latest
ARG JAR_FILE
ADD ${JAR_FILE} employee-h2-docker-plugin.jar
EXPOSE 9012
ENTRYPOINT ["java","-jar","employee-h2-docker-plugin.jar"]
