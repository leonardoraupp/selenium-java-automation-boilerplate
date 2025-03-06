# Clean the target folder (removes the old  test results)

mvn clean

# Run the tests

mvn test

# Show the report on browser temporary

mvn allure:serve

# Generates a permanent Allure report on target/site/allure-maven/index.html

mvn allure:report
