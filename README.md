This is a sample project demonstrating how to create a docker image using Spring boot
framework

*Prerequisites*

**Docker Desktop is installed**

Docker image is created in 2 ways
1. Using docker file
     - We used the layered approach when creating the image. 
     - Follow below steps to create running instance of docker image
     
       - Build the project  `mvn clean install`
       - cd into the path where docker file is
       - run  `docker build -t imageName`  to create the image 
          > docker build . -t helloworlddocker
       - run `docker images` to get overview of newly created image 
       - Create container using `docker run --name myProgram imageName -d -phostmachineport:containerport`
         > docker run -d -p8111:8080 --name dockerexmaples helloworlddocker
     - Run localhost:8111 to view the message
2. Using Spring Boot build-image goal  
     > `mvn  spring-boot:build-image  -Dspring-boot.build-image.imageName=helloworldimagefromspringboot`

