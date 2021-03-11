FROM openjdk:8
MAINTAINER Swasti Shreya Mishra mishra.swastishreya13@gmail.com
COPY ./target/scientific_calculator_devops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "scientific_calculator_devops-1.0-SNAPSHOT.jar"]
