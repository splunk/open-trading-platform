FROM maven:3.6.3-openjdk-17 AS maven_build

COPY ./ ./

RUN mvn clean
RUN mvn assembly::assembly

FROM eclipse-temurin:21-jdk-ubi9-minimal AS build

ADD swagger /swagger
ADD resource /resource

COPY --from=maven_build target/fixmarketsimulator-1.0-bin.tar.gz /usr/src
RUN cd /usr/src && tar -xzf fixmarketsimulator-1.0-bin.tar.gz && rm fixmarketsimulator-1.0-bin.tar.gz

CMD java -cp "/usr/src/fixmarketsimulator-1.0/lib/*" com.ettech.fixmarketsimulator.App
