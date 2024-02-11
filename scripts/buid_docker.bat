docker build --build-arg JAR_FILE=target/*.jar -t myorg/myapp .

docker run -p 8080:8080 myorg/myapp