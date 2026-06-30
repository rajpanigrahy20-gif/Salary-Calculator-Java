# Salary Calculator (Java)

A simple Java application that calculates an employee's salary based on hours worked and hourly rate. It computes the gross pay, deducts a 10% tax, and displays the final net pay in a formatted salary slip.

## Features
- Accepts employee name
- Accepts hours worked and hourly rate
- Calculates Gross Pay
- Calculates 10% Tax
- Calculates Net Pay
- Displays a formatted salary slip

## Technologies Used
- Java
- VS Code
- JDK

## How to Run
1. Clone this repository.
2. Open the project in VS Code or any Java IDE.
3. Compile the program:
   ```bash
   javac SalaryCalculator.java
   ```
4. Run the program:
   ```bash
   java SalaryCalculator
   ```

## Formulas Used
- Gross Pay = Hours Worked × Hourly Rate
- Tax = Gross Pay × 10 / 100
- Net Pay = Gross Pay − Tax

## Sample Output

```
Enter Employee Name: Raj
Enter Hours Worked: 40
Enter Hourly Rate: 500

===== Salary Slip =====
Employee Name: Raj
Hours Worked: 40.0
Hourly Rate: 500.0
Gross Pay: 20000.0
Tax (10%): 2000.0
Net Pay: 18000.0
```

## Learning Objectives
- User input using `Scanner`
- Variables and data types
- Arithmetic calculations
- Formatted output
- Basic Java programming

## Author
Raj

## License
This project is licensed under the MIT License.
