FROM openjdk:17-ea-jdk-oracle
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=qa","-jar","CuponService-0.0.1-SNAPSHOT.jar"]
COPY target/CuponService-0.0.1-SNAPSHOT.jar .