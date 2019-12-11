FROM java:8-jdk-alpine

COPY ./target/SkillListApplication.jar /usr/app/

ENTRYPOINT ["java","-jar","usr/app/SkillListApplication.jar"]
