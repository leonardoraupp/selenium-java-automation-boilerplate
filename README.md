## About

 Test Automation project using Selenium, Java, TestNG, Allure Reports. There is a setup for running tests in parallel saving time during the process.

## Running the tests

### Clean the target folder (removes the old  test results)

```bash
mvn clean
```

### Run the tests

```bash
mvn test
```

### Show the report on browser temporary

```bash
mvn allure:serve
```

### Generates a permanent Allure report on target/site/allure-maven/index.html

```bash
mvn allure:report
```

