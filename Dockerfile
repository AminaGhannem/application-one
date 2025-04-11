FROM openjdk:8
EXPOSE 8080
ADD target/application-one.jar application-one.jar
ENTRYPOINT ["java", "-jar", "application-one.jar"]