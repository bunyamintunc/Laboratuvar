FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/labaratuvar-staj-0.0.1-SNAPSHOT.jar labaratuvar-staj-0.0.1.jar
ENTRYPOINT ["java","-jar","labaratuvar-staj-0.0.1.jar"]
