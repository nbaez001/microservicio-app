FROM openjdk:17-jdk-alpine
COPY "./build/libs/customer-service-1.0.jar" "app.jar"
EXPOSE 8092
ENTRYPOINT ["java","-jar","app.jar"]
