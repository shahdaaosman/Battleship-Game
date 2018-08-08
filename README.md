# Battleship Game
A Battle game is a guessing game and is played on a grid (called board).
Each player tries to guess the positions of the battleships of
the other player to call “Shots” and destroy the battleships. 
The winner is the player who can first destroy all ships of the other player.


# Features implemented
<p>This project was built using two design pattern:</p>
  <p>1-Singelton Design Pattern.</p>
  This design pattern help to Ensure that game class has only one instance, and provide a global point of access to it.
  <p>2-Simple Factory Design Pattern.</p>
  This allows interfaces for creating objects without exposing the object creation logic to the client.

# Implementation Details
There is a 5x5 board with 3 hidden ships for 2 player.
The objective of the game is the player should figuring out where these ships are placed and hit them.
Every shot fired is said if a ship was hit. Then the next player have his turn.
The player who find and sink the 3 ships win the game.

Board Legend:
-: Water in the block. Still not been shot.
*: Shot fired, there's nothing there.
X: shot fired, there was a ship.

# Future Implantation
<p>1- The game can be implemented more advanced by using client and server 
  implementation using for example Socket-Server implementation
   so that players connect to the game server and play.</p>


# Getting Started

This project built in a Java Maven Template and it
use Apache Maven to compile and run. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run


```bash
java -classpath target/Example-1-1.0-SNAPSHOT-jar-with-dependencies.jar edu.bu.met.cs665.Main
```

or


```bash
run.sh 
```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```

# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```
