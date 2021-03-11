FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build app/target/scientific_calculator_devops-1.0-SNAPSHOT-jar-with-dependencies.jar /app/scientific_calculator_devops-1.0-SNAPSHOT-jar-with-dependencies.jar
CMD ["java","-jar", "./scientific_calculator_devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]
