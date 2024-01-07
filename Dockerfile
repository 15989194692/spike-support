FROM openjdk:12-alpine

MAINTAINER spike-support

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    JAVA_OPTS="" \
    PORT=8092 \
    PROFILES="default"

ADD /target/*.jar /spike-support-executable.jar

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /spike-support-executable.jar --spring.profiles.active=$PROFILES"]

EXPOSE $PORT
