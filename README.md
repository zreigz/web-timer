# WEB timer microservice
## Build project
```
docker run -it --rm -v "$(pwd)":/opt/maven -w /opt/maven maven:3.2-jdk-7 mvn clean install
```
## Run
```
$ java -jar ./target/time-service-0.0.1-SNAPSHOT.jar server configuration.yml
```
