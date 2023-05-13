FROM openjdk:17-jdk-alpine
COPY "./build/libs/product-service-1.0.jar" "app.jar"
EXPOSE 8091
ENTRYPOINT ["java","-jar","app.jar"]