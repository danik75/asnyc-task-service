# asnyc-task-service
Change
spring boot postgres, redis, kafka service to submit task and manage them

# Build image for application via docker file
docker build --build-arg JAR_FILE=target/*.jar -t <image-name> .

# Run container from image
docker run -p 8080:8080 <image-name>

# Start postgres DB via docker compose.
docker compose -f .\docker-compose-postgres.yaml up