// SimpleCalculator.java
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display welcome message
        System.out.println("Welcome to Simple Calculator!");
        System.out.println("You can perform Addition, Subtraction, Multiplication, and Division.");

        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Input operation
        System.out.print("Enter an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Perform calculation based on operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;

            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
                return;
        }

        // Display result
        System.out.println("The result is: " + result);

        scanner.close();
    }
}
