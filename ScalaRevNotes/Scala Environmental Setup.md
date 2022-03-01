The Scala language can be installed on any UNIX-like or Windows system. Before you start installing Scala on your machine, you must have Java 1.8 or greater installed on your computer.

## Installing Scala on Windows:
### Step (1): JAVA Setup:
First, you must set the JAVA_HOME environment variable and add the JDK's bin directory to your PATH variable. To verify if everything is fine, at the command prompt, type **java -version** and press Enter. You should see something like the following:

```
C:\>java -version
jopenjdk version "1.8.0_302"
OpenJDK Runtime Environment (Temurin)(build 1.8.0_302-b08)
OpenJDK 64-Bit Server VM (Temurin)(build 25.302-b08, mixed mode)
C:\>
```
Next, test to see that the Java compiler is installed. Type **javac -version**. You should see something like the following:
```
C:\>javac -version
javac 1.8.0_302
C:\>
```
### Step (2): Scala Setup:
Next, you can download Scala from http://www.scala-lang.org/downloads and install windows binaries. Finally, open a new command prompt and type scala -version and press Enter. You should see the following:

```
C:\>scala -version
Scala code runner version 2.13.6 -- Copyright 2002-2021, LAMP/EPFL and Lightbend, Inc.
```
Congratulations, you have installed Scala on your Windows machine. Next section will teach you how to install Scala on your Mac OS X and Unix/Linux machines.

 

## Installing Scala on Mac OS X and Linux
### Step (1): JAVA Setup:
Make sure you have got the Java JDK 1.8 or greater installed on your computer and set JAVA_HOME environment variable and add the JDK's bin directory to your PATH variable. To verify if everything is fine, at the command prompt, type **java -version** and press Enter. You should see something like the following:
```
$java -version
openjdk version "1.8.0_312"
OpenJDK Runtime Environment (build 1.8.0_312-8u312-b07-0ubuntu1~20.04-b07)
OpenJDK 64-Bit Server VM (build 25.312-b07, mixed mode)
$
```
Next, test to see that the Java compiler is installed. Type **javac -version**. You should see something like the following:
```
$javac -version
javac 1.8.0_312
```


### Step (2): Scala Setup:
Open your terminal and run the following commands as shown below
```
$ wget http://www.scala-lang.org/files/archive/scala-2.12.10.deb
$ sudo dpkg -i scala-2.12.410.deb
$ sudo apt-get update
$ sudo apt-get install scala
```
Finally, open a new command prompt and type scala -version and press Enter. You should see the following:
```
$ scala -version
Scala code runner version 2.12.10 -- Copyright 2002-2019, LAMP/EPFL and Lightbend, Inc.
```
Congratulations, you have installed Scala on your UNIX/Linux machine.