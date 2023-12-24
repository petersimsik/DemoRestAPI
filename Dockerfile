FROM openjdk:17-jdk-slim
MAINTAINER Peter Simsik
COPY DemoRestAPI.jar DemoRestAPI.jar
RUN mkdir -p /opt/DemoRestAPILogs
ENTRYPOINT ["java","-jar","/DemoRestAPI.jar"]