FROM openjdk:17-jdk-alpine
COPY "./build/libs/shopping-service-1.0.jar" "app.jar"
EXPOSE 8093
ENTRYPOINT ["java","-jar","app.jar"]
