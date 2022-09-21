FROM openjdk:18
WORKDIR /app
ARG SOURCE_PATH=/target/deploy-nexus-0.0.1-SNAPSHOT.jar
ARG DESTINATION_PATH=deploy-nexus.jar
COPY ${SOURCE_PATH} ${DESTINATION_PATH}
ENTRYPOINT ["java", "-jar", "deploy-nexus.jar"]
EXPOSE 8080