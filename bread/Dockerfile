FROM alpine:edge
RUN apk add --no-cache openjdk8
COPY ./target/bread-0.0.1-SNAPSHOT.jar /usr/src/bread/
WORKDIR /usr/src/bread
EXPOSE 8080
CMD ["java", "-jar", "bread-0.0.1-SNAPSHOT.jar"]