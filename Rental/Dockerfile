FROM eclipse-temurin:17-jdk-jammy
WORKDIR /opt
ENV PORT 8060
EXPOSE 8060
COPY target/*.jar /opt/rental.jar
ENTRYPOINT exec java $JAVA_OPTS -jar rental.jar