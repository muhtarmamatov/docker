FROM maven:3.8.5-openjdk-11
COPY pom.xml /tmp/
COPY src/ /tmp/src/
WORKDIR /tmp/
RUN mvn package -Dmaven.test.skip

FROM adoptopenjdk/openjdk11:alpine-slim
COPY --from=0 /tmp/target/knote-java.jar  knote-java.jar

RUN sh -c 'touch /knote-java.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/knote-java.jar"]