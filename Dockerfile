FROM openjdk:8-jdk-alpine
WORKDIR /app/
COPY /target/Task20-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "Task20-0.0.1-SNAPSHOT.jar"]

#dokcer run -d -p 3000:8080 task20 task20