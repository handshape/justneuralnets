# Introduction 
JNN is a cluster of projects geared towards getting the complicated parts of neural-net binary classifiers encapsulated in an easy-to-use set of tools.

# Getting Started
JNN is a Java 17 application that uses Maven for build and dependency management. You will need:
1.	A Java Development Kit -- we recommend Adoptium.
2.	Apache Maven -- many IDEs already bundle Maven.

## Build and Test
To build and test JNN, ensure that both Java and Maven are installed and on your path, and type:
```
mvn clean install
``` 
If you want to build the full project site, use:
```
mvn clean install site
``` 
## Running
To start the JavaFX training UI:
```
java -jar justneuralnets-ui/target/justneuralnets-ui-1.0-SNAPSHOT-bin.jar
```
When a model completes training, the user is prompted to save two files. The first is given a `.jnn` suffix, and contains the structure of the model. The second is given a `.mdl` suffix, and contains the trained model's parameters. Both are needed at evaluation time.

To start the evaluation API microservice:
```
java -jar jnnevalmicroservice/target/justneuralnets-evalmicroservice-1.0-SNAPSHOT-bin.jar [port] [path.jnn] [path.mdl]
```
Where `port` is the TCP port on which to listen for connections, `path.jnn` is the path to the model structure file, and `path.mdl` is the path to the model parameters file. Once started, the service offers a rudimentary "high-striker" UI for submitting features to the model for prediction.

# Contribute
As always, the code needs more tests, documentation, and user feedback. Feel free to contribute!
