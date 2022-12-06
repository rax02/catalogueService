FROM openjdk:11.0.11-jre-slim
COPY src/main/resources/application.yml config.yml
ADD target/glfasshon-catalogueservice-0.0.1-SNAPSHOT.jar glfasshon-catalogueservice-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT java -jar glfasshon-catalogueservice-0.0.1-SNAPSHOT.jar