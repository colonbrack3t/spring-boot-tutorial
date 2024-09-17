# spring-boot-tutorial
This aims to be a helpful step - by - step guide for setting up SpringBoot and a comprehensive CI/CD pipeline

1) Step 1: Set up a basic Springboot. You can use [https://start.spring.io/](https://start.spring.io/) to generate a ZIP file with all the bits you need. Whether you use this tool or want to create the folder structure manualy, make sure to add the following dependencies:
     - spring-boot-starter-web
     - spring-boot-starter-test
     - lombok
  Once you have the structure, add a Controller and make a super basic GET endpoint that responds with "Hello World"

2) Step 2: Lets add a new Service (create a file under `service/ExampleService.java`) that fetches a value from `resources/application.properties` and returns it. Add a new endpoint to the controller to surface this String

