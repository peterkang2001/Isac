FROM store/oracle/serverjre:1.8.0_241-b07

MAINTAINER peterkang2001@gmail.com
USER root
ENV TIME_ZONE Asia/Shanghai

RUN mkdir /app\
    && mkdir /logs

ADD target/isac-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app

EXPOSE 8080 8080



CMD ["java", "-jar" ,"app.jar"]