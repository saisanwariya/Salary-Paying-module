# Employee Hierarchy with Compensation Models

## Overview

This project enhances the Employee Hierarchy created in Programming Assignment 2 by introducing an interface called Compensation with two methods: `earnings()` and `raise(double percent)`. Additionally, it includes abstract and concrete classes that implement this interface to model different compensation scenarios.

## Program Functionality

The project consists of the following classes:

1. **CompensationModel** (Abstract Class): An abstract class implementing the Compensation interface. It serves as the base class for compensation models.

2. **SalariedCompensationModel**: A subclass of CompensationModel for employees with fixed weekly salaries.

3. **HourlyCompensationModel**: A subclass of CompensationModel for employees paid hourly with overtime pay for hours exceeding 40 per week.

4. **CommissionCompensationModel**: A subclass of CompensationModel similar to Assignment 2 but now extending CompensationModel.

5. **BasePlusCommissionCompensationModel**: A subclass of CommissionCompensationModel with a base salary.

6. **Employee**: The Employee class from Assignment 2 is modified to use CompensationModel instead of CommissionCompensationModel. It also includes a `raise(double percent)` method.

## Software Setup

To run this program, you will need:

- Java Development Kit (JDK) installed on your system.

## Running the Program

1. Change to the project directory:

   ```bash
   cd employee-compensation
   ```

2. Compile the Java source files:

   ```bash
   javac *.java
   ```

3. Run the program:

   ```bash
   java Main
   ```

## Notes

- The provided code in the Main class tests the various compensation models and employee interactions. You can modify this code to test additional scenarios or custom inputs.
- Ensure that you have the necessary Java environment variables and classpath configured to compile and run the program successfully.
- Please abide by the academic integrity statement mentioned in this document while using or referencing this code.




# Academic Integrity Statement

Please note that all work included in this project is the original work of the author, and any external sources or references have been properly cited and credited. It is strictly prohibited to copy, reproduce, or use any part of this work without permission from the author.

If you choose to use any part of this work as a reference or resource, you are responsible for ensuring that you do not plagiarize or violate any academic integrity policies or guidelines. The author of this work cannot be held liable for any legal or academic consequences resulting from the misuse or misappropriation of this work.

Any unauthorized copying or use of this work may result in serious consequences, including but not limited to academic penalties, legal action, and damage to personal and professional reputation. Therefore, please use this work only as a reference and always ensure that you properly cite and attribute any sources or references used.
