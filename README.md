# Getting Started

The pool.ntp.org cluster of accurate time servers provides the following domains for Ukraine:
 * 0.ua.pool.ntp.org
 * 1.ua.pool.ntp.org
 * 2.ua.pool.ntp.org
 * 3.ua.pool.ntp.org
 * 4.ua.pool.ntp.org

For each domain, using the API service https://ip-api.com/, check that the server is actually located in Ukraine ("country": "Ukraine").
Link to the documentation https://ip-api.com/docs/api:json

Regulations:
- the task performed in java programming language 
- maven build system 
- testng testing library


  Additionally:
- integrated Allure report
- integrated multi-threaded test execution 
- integrated package into a docker container

## How to run tests
 1) Run src/test/java/TestCountry.java or
 2) In terminal: [mvn clean test] or [mvn clean test -DdefaultSuiteFiles="src/test/resources/testng.xml"]

## How to get results:
  In terminal: [allure serve target/allure-results]
  
## How to create and run docker image
 1) In terminal: [docker build -t megogo-test .]
 2) In terminal: [docker run megogo-test]