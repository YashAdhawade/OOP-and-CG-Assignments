import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator");

            try {
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                System.out.print("Enter the operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                double result;
               

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
                        if (num2 == 0) {
                            throw new ArithmeticException("Division by zero is not allowed.");
                        }
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        break;
                    default:
                        System.out.println("Invalid operator. Please use +, -, *, or /.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter valid numbers.");
                scanner.next();
            } catch (ArithmeticException e) {
                System.err.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("An unexpected error occurred: " + e.getMessage());
            }

        scanner.close();
    }
}
