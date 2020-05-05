# Grades histogram

Grades histogram is an app whose purpose is to calculate the frequencies of an amount of grades and present them through a histogram.
This application is written in Java (version: 1.8.0_181) and uses Maven 3.6.3. 

More specifically:
- Histogram.java is a class which reads the file that includes the grades 
- HistogramGenerator.java is a class which calculates the frequencies, produces a histogram and presents it through a frame

# Getting Started #

## Prerequisites ##

In order to build the app you need:
- Eclipse IDE
- a JDK
- Maven 3.6 

## Build the app ##

With the command Run as...Maven install you will be able to build the project!
 A jar file will be created with the name gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar
 
 ## Run the app ##

In order to run the app:
- Open a terminal
- Go to the directory where the project is saved
- use the command: java -jar gradeshistogram/target/gradeshistogram-0.0.1-SNAPSHOT-jar-with-dependencies.jar grades.txt (or any other txt file with grades)

A histogram will appear on screen!

