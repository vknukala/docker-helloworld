# Filename: Dockerfile
FROM openjdk:11-jre-slim
MAINTAINER vknukala
ARG LAYER=target/layers
COPY ${LAYER}/BOOT-INF/lib /docker-demo/lib
COPY ${LAYER}/META-INF /docker-demo/META-INF
COPY ${LAYER}/BOOT-INF/classes /docker-demo
ENTRYPOINT ["java","-cp","docker-demo:docker-demo/lib/*","com.github.vknukala.docker.Application"]