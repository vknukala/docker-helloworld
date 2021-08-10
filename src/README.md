This is a sample project demonstrating how to create a docker image using Spring boot
framework

Docker image is created in 2 ways
1. Using docker file
     - We used the layered approach when creating the image. 

2. Using Spring Boot build-image goal  
     > `mvn  spring-boot:build-image  -Dspring-boot.build-image.imageName=helloworldimagefromspringboot`

