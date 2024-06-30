FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/bancoA-0.0.1.jar
COPY  ${JAR_FILE} back_bancoa.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "back_bancoa.jar"]