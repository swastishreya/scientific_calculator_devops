FROM openjdk:8
COPY ./target/scientific_calculator_devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp", "scientific_calculator_devops-1.0-SNAPSHOT-jar-with-dependencies.jar", "ScientificCalculator"]
