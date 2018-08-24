# Spring Restful Sample Application 

## Understanding the Spring Petclinic application with a few diagrams
<a href="https://speakerdeck.com/michaelisvy/spring-petclinic-sample-application">See the presentation here</a>

## Running Spring rest locally

You can then access Restfull here: http://localhost:8090/

<img width="1042" alt="petclinic-screenshot" src="https://cloud.githubusercontent.com/assets/838318/19727082/2aee6d6c-9b8e-11e6-81fe-e889a5ddfded.png">

## In case you find a bug/suggested improvement for Spring Restfull Webservices
Our issue tracker is available here: https://github.com/Sudarshan-Gowda/basic-restfull-using-spring/issues


## Working with Petclinic in Eclipse/STS

### prerequisites
The following items should be installed in your system:
* Eclipse - Mars/Oxygen
* Server - Wildfly 8/10
* Postman

### Steps:

1) Download this Project and do maven import.
```
git clone https://github.com/Sudarshan-Gowda/basic-restfull-using-spring
```
2) Inside Eclipse
```
File -> Import -> Maven -> Existing Maven project
```


## Looking for something in particular?

|Spring Boot Configuration | Class or Java property files  |
|--------------------------|---|
|The Main Class | [SpringRestfullWebServiceController](https://github.com/Sudarshan-Gowda/basic-restfull-using-spring/src/main/java/com/star/sud/web/SpringRestfullWebServiceController.java) |
|Properties Files | [application.properties](https://github.com/Sudarshan-Gowda/basic-restfull-using-spring/src/main/resources) |


## Steps to test the application:

1) Once the application is installed properly, Run the application
2) Hit the request from postman. In this project mainly two methods where covered (GET/POST).
	
	a) For GET method no need to send any data(Json) as a postman request
	b) For POST method need to send the data in Json format. The sample json data is mentioned in the below file.
	   |Sample JSON format data |sample-json| (https://github.com/Sudarshan-Gowda/basic-restfull-using-spring/sample-json.txt)
   
# Contributing

The [issue tracker](https://github.com/Sudarshan-Gowda/basic-restfull-using-spring/issues) is the preferred channel for bug reports, features requests and submitting pull requests.

For pull requests, editor preferences are available in the [editor config](.editorconfig) for easy use in common text editors. 

