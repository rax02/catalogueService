FROM openjdk:11.0.11-jre-slim
ADD target/glfasshon-catalogueservice-0.0.1-SNAPSHOT.jar glfasshon-catalogueservice-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","glfasshon-catalogueservice-0.0.1-SNAPSHOT.jar"]
