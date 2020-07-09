FROM java:8-jdk-alpine

COPY maven/${project.artifactId}-${project.version}.jar /usr/app/

ENV SPRING_PROFIES_ACTIVE docker

WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "-Djava.security.egd=file:/dev/urandom", "${project.artifactId}-${project.version}.jar"]