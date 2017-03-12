# ToDoRead

Web application that helps you collect and manage a list of links for reading later.


## Development

### Start postgres

You need only docker to start database. To start docker with login `postgres` and password `password` you just need to run
```
./start-docker.sh
```

### Building application

```
./gradlew clean build
```

### Running application

There are 2 ways to run application:
```
./gradlew bootRun
```
starts application without tests and supports reloading of resources

Also one can build application and run
```
java -jar build/libs/*.jar
```

## Configuration

Application can be fully configures with environment variables. One just needs to replace all `.`, `-` and camelCase with `SNAKE_UPPER_CASE` names
