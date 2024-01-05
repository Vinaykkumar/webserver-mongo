# Use the official OpenJDK 17 image as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/product-client-0.0.1-SNAPSHOT.jar /app/product-client-0.0.1-SNAPSHOT.jar

# Expose the port that the Spring Boot application will run on
EXPOSE 9092

# Define the command to run your application
CMD ["java", "-jar", "product-client-0.0.1-SNAPSHOT.jar"]