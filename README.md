Whaot Automation Project
📋 Overview
This project is an automation framework for testing the Whaot web application (https://www.whaot.com). It is built using:

Cucumber for Behavior-Driven Development (BDD).
Java as the programming language.
Maven for project management and build automation.
Docker for containerized test execution.
The framework follows a modular structure and integrates reporting and reusable test logic for efficient testing.

📂 Project Structure

src/test: Contains test features, step definitions, and hooks.
reports/: Stores the generated test execution reports (e.g., HTML reports).
failed_Scenarios/: Stores data for scenarios that failed during test execution for debugging.
logs/: Stores logs for debugging purposes.
screenshots/: Captures screenshots for failed test cases.
Dockerfile: Configuration for running the project in a containerized environment.
pom.xml: Maven configuration file for managing dependencies and plugins.

⚙️ Setup Instructions

1. Clone the repository:
git clone <repository-url>
cd <repository-directory>

2. Build the Docker Image
To set up the project in a Docker container, build the image using the Dockerfile:
docker build -t whaot-automation .

3. Set up Test Configurations
Update the test configurations (like URLs or test data) in the relevant config or properties files.

🚀 How to Run Tests
1. Run Tests Locally Using Maven
To run all test files in the src/test directory:

mvn test
To run a specific feature file:

mvn test -Dcucumber.options="src/test/resources/features/<feature-name>.feature"
2. Run Tests via the Runner Class
The Runner class is configured to execute all tests in the project:

mvn exec:java -Dexec.mainClass="src.test.java.runner.Runner"
3. Run Tests in a Docker Container
To execute tests inside the Docker container:

Build the Docker image if not done already:

docker build -t whaot-automation .
Run the container and execute tests:
docker run --rm whaot-automation


🧾 Features
BDD Framework: Uses Gherkin syntax for feature files to enhance readability and collaboration.
Cucumber Reports: Generates comprehensive reports with detailed test execution logs.
Containerized Execution: Leverages Docker for a consistent and isolated testing environment.
Logging and Screenshots: Logs all test execution steps and captures screenshots for failed scenarios.
Centralized Test Execution: All tests are managed and executed via a centralized Runner class.


📊 Test Reports
After test execution:

Reports are available in the reports/ folder.
HTML reports provide a summary of all test cases, pass/fail status, and detailed logs.







