This is a sample project demonstrating how to create a docker image using Spring boot
framework

*Prerequisites*

1. You need docker 64-bit. Check [docker installation](https://docs.docker.com/installation/#installation )
2. Verify if you can run `docker` commands from the command shell 

Docker image is created in 2 ways
1. Using docker file

   a. Fat JARs layers
      - We use the layered approach when creating the image, taking advantage of clean separation between dependencies
        and application resources in fat JARs
      - Build the project `mvn spring-boot:run -Dspring-boot.run.profiles=test` to run the application without the docker container
      - Assuming you a valid Dockerfile, follow below steps to create running instance of docker image
          - cd into the path where docker file is
          - run  `docker build -t imageName`  to create the image
            > docker build . -t helloworlddocker
          - run `docker images` to get overview of newly created image
          - Create container using
        
            `docker run --name myProgram imageName -d -phostmachineport:containerport`
            > docker run -e "SPRING_PROFILES_ACTIVE=test" -d -p8222:8222 --name dockerexamples helloworlddocker
      - Run localhost:8222 to view the message 
   
   b. Spring boot layer Index
      > to be implemented
2. Using Spring Boot build-image goal
     - This plugin creates OpenCloudInitiative(OCI) image from jar using CNB. Check [CloudNativeBuildpacks](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#features.container-images.building.buildpacks)
     - Images are build and run as not root users
     - Run `mvn  spring-boot:build-image  -Dspring-boot.build-image.imageName=imageName` to create an image
       > `mvn  spring-boot:build-image  -Dspring-boot.build-image.imageName=helloworldimagefromspringboot`
     - Create container using spring default profile
       > docker run -d -p8111:8111 helloworldimagefromspringboot
     - Run localhost:8111 to view the message

     

