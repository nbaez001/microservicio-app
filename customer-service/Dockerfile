FROM openjdk:17-jdk-alpine
COPY "./build/libs/customer-service-1.0.jar" "customer-service-1.0.jar"
EXPOSE 8092
ENTRYPOINT ["java","-jar","customer-service-1.0.jar"]
