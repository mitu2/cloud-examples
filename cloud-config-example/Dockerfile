FROM adoptopenjdk:11-jre-hotspot
VOLUME /tmp
ADD ./target/cloud-config-example-1.0.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]