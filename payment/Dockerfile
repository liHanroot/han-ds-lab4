FROM eclipse-temurin:17-jdk-jammy
WORKDIR /opt
ENV PORT 8050
EXPOSE 8050
COPY target/*.jar /opt/payment.jar
ENTRYPOINT exec java $JAVA_OPTS -jar payment.jar