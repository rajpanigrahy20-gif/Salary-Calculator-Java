import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: "); // Prompt the user to enter the employee's name
        String name = sc.nextLine();

        System.out.print("Enter hours worked: "); // Prompt the user to enter the number of hours worked
        double hours = sc.nextDouble();

        System.out.print("Enter hourly rate: "); // Prompt the user to enter the hourly rate
        double rate = sc.nextDouble();

        double grossPay = hours * rate;      
        double tax = grossPay * 0.10;
        double netPay = grossPay - tax;

        System.out.println("\n===== Salary Slip =====");
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Hourly Rate: " + rate);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Tax (10%): " + tax);
        System.out.println("Net Pay: " + netPay);

        sc.close();
    }
}
