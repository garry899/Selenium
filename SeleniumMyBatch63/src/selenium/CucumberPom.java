package selenium;

public class CucumberPom {
	<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	  <modelVersion>4.0.0</modelVersion>
	  <groupId>CucumberJava</groupId>
	  <artifactId>CucumberJava</artifactId>
	  <version>0.0.1-SNAPSHOT</version>
	  <dependencies>
	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
	<dependency>
	    <groupId>io.cucumber</groupId>
	    <artifactId>cucumber-java</artifactId>
	    <version>7.4.0</version>
	</dependency>

	<!-- https://mvnrepository.com/artifact/junit/junit -->
	<dependency>
	    <groupId>junit</groupId>
	    <artifactId>junit</artifactId>
	    <version>4.13.2</version>
	    <scope>test</scope>
	</dependency>

	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
	<dependency>
	    <groupId>io.cucumber</groupId>
	    <artifactId>cucumber-junit</artifactId>
	    <version>7.4.0</version>
	    <scope>test</scope>
	</dependency>


	  </dependencies>
	</project>
}
