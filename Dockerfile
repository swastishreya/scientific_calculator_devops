FROM alpine/git as clone
WORKDIR /app
RUN git clone https://github.com/swastishreya/scientific_calculator_devops.git

FROM maven:3.6-jdk-8-alpine as build
WORKDIR /app
COPY --from=clone /app/scientific_calculator_devops /app
RUN mvn clean install

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build app/target/scientific_calculator_devops-1.0-SNAPSHOT.jar /app/scientific_calculator_devops-1.0-SNAPSHOT.jar
CMD ["java","-jar", "./scientific_calculator_devops-1.0-SNAPSHOT.jar"]
