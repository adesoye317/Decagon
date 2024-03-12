# Use official OpenJDK image as base image
FROM openjdk:8

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container
COPY target/decagon-0.0.1-SNAPSHOT.jar /app

# Expose the port the application runs on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "decagon-0.0.1-SNAPSHOT.jar"]
