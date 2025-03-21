# ProtoCommerce Automation & Manual Testing

This repository contains the automation and manual testing framework for **ProtoCommerce**, an e-commerce platform. The repository is divided into two sections: automation testing and manual testing, providing comprehensive test coverage for the application.

## Table of Contents

- [Project Overview](#project-overview)
- [Directory Structure](#directory-structure)
- [Technologies Used](#technologies-used)
- [Test Execution](#test-execution)
- [Manual Testing](#manual-testing)
- [Contributing](#contributing)
- [License](#license)

## Project Overview

The **ProtoCommerce Automation & Manual Testing** project includes:

- **Automation Testing**: Using Selenium WebDriver with Java, TestNG, and Page Object Model (POM) for functional and regression testing of the e-commerce platform.
- **Manual Testing**: Includes test cases and reports for manual verification of critical functionalities.
  
This project is aimed at ensuring that the ProtoCommerce application functions correctly and efficiently across various features such as the user login process, product management, checkout, and more.

## Directory Structure

The directory structure of the repository is as follows:

~~~
ProtoCommerce-Automation/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.pageObjects/           # Page Object Model classes
│   │   │   │   ├── addToCartPage.java     # Page class for Add to Cart functionality
│   │   │   │   ├── form.java              # Page class for form interactions
│   │   │   ├── com.utils/                 # Utility classes
│   │   │   │   ├── DriverManager.java     # WebDriver management
│   │   ├── resources/                     # Configuration files (if any)
│   ├── test/
│   │   ├── java/
│   │   │   ├── com.tests/                 # Test classes
│   │   │   │   ├── formTest.java          # Test cases for form validation
│   ├── resources/                          # Test data and additional resources
├── pom.xml                                 # Maven dependencies and configurations
├── testng.xml                              # TestNG test suite configuration
├── test-output/                            # Test execution reports
├── target/                                 # Compiled classes and generated reports
├── Maven Dependencies/                     # External libraries managed by Maven
├── JRE System Library [JavaSE-1.8]         # Java runtime environment
~~~


### Key Components:

- **Page Objects (`pageObjects/`)**: Contains Java classes that represent the different pages of the ProtoCommerce application (e.g., `addToCartPage.java`, `form.java`).
- **Utilities (`utils/`)**: Contains utility classes such as `DriverManager.java` to manage WebDriver setup.
- **Test Classes (`tests/`)**: Contains test scripts (e.g., `formTest.java`) that implement test cases for different functionalities of the application.

## Technologies Used

- **Selenium WebDriver**: For automating browser interactions.
- **Java**: Programming language for writing test scripts.
- **TestNG**: Testing framework for managing and executing tests.
- **Maven**: Build automation tool for managing dependencies and running tests.
- **Page Object Model (POM)**: Design pattern to enhance test maintainability and readability.
- **JUnit**: For unit testing and generating reports.

## Test Execution

To execute the automated tests, follow these steps:

### Prerequisites:

- Java 8 or later installed.
- Maven installed to manage dependencies and execute tests.

### Steps to Run the Tests:

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/yourusername/kartiksharma200-protocommerce-automation.git
   cd kartiksharma200-protocommerce-automation/ProtoCommerce-Automation
