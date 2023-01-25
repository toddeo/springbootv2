FROM maven:3.8.3-openjdk-17

COPY . src
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.7.3/wait /wait
RUN chmod +x /wait

## Launch the wait tool and then your application with dev profile override
CMD cd src ; /wait && mvn spring-boot:run -Dspring-boot.run.profiles=docker

