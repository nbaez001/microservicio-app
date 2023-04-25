FROM openjdk:17-jdk-alpine
COPY "./build/libs/registry-service-1.0.jar" "registry-service-1.0.jar"
EXPOSE 8099
ENTRYPOINT ["java","-jar","registry-service-1.0.jar"]