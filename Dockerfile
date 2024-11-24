FROM maven:3.8.5-openjdk-17-slim
COPY ./ /app
WORKDIR /app
RUN mvn clean compile
CMD mvn test -DdefaultSuiteFiles="src/test/resources/testng.xml"