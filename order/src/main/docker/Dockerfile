FROM java:8-jdk-alpine

COPY maven/${project.artifactId}-${project.version}.jar /usr/app/app.jar

ENV SPRING_ACTIVE_PROFIES DOCKER

WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "app.jar"]