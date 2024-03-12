# Use official OpenJDK image as base image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container
COPY target/banking-application.jar /app

# Expose the port the application runs on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "banking-application.jar"]
