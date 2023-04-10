From openjdk:8
EXPOSE 8000
copy ./target/WelcomeMessage-0.0.1-SNAPSHOT.jar WelcomeMessage-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","WelcomeMessage-0.0.1-SNAPSHOT.jar"]

