# kogito-parallel Project

The application is a simple workflow application that execute several task bpmn on parallel. This microservice is built in Quarkus and will be provided.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

To run the service, we first need to compile and package it.

Execute the following command in a terminal. Make sure that you’re not in the kogito-parallel project directory, as we want to clone this project in its own directory.

$ git clone https://github.com/chakerfezai/kogito-parallel.git

Once the project is cloned, navigate into the directory

$ cd kogito-parallel

To package the project, execute the following command:

$ mvn clean package

This creates a new runnable Quarkus JAR file. Execute the following command to run the application:

$ java -jar /target/kogito-parallel-1.0.0-SNAPSHOT.jar

With the microservice running, we can access its [Swagger-UI](http://localhost:8080/q/swagger-ui/) here.


## Related Guides

- Kogito ([guide](https://quarkus.io/guides/kogito)): Add business automation capabilities - processes and rules with Kogito (a toolkit that originates from projects Drools and jBPM)
