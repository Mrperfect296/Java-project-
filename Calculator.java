import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Welcome to the Simple Calculator!");
        
        // Loop to allow multiple calculations
        while (true) {
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                    break;
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String continueCalc = scanner.next();
            if (!continueCalc.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Thank you for using the Simple Calculator. Goodbye!");
    }
}
