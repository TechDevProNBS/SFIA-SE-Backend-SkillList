FROM java:8-jdk-alpine

ARG PORT_NAME

ARG PASSWORD

COPY ./target/accessing-mongodb.jar  /usr/app/

ENV SKILLLIST_PORT=$PORT_NAME

ENV MONGODB_PASSWORD_SKILLLIST=$PASSWORD

ENV PROFILE="testing"

ENTRYPOINT java -jar -Dspring.profiles.active=$PROFILE usr/app/accessing-mongodb.jar

