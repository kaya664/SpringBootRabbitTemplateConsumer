FROM openjdk:12
EXPOSE 8080
ADD /target/RabbitMQConsumerProject-0.0.1-SNAPSHOT.jar kayastd/rabbitmqconsumer.jar
ENTRYPOINT ["java","-jar","kayastd/rabbitmqconsumer.jar"]