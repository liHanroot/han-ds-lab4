FROM eclipse-temurin:17-jdk-jammy
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
COPY target/*.jar /opt/lab4.jar
ENTRYPOINT exec java $JAVA_OPTS -jar lab4.jar